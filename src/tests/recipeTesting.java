package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import Code.InventoryManagement;

class recipeTesting {


	@Test
	//Unit test to test the addFood method
	void testAddingRecipeInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
		correctMockInventory.put("apple", (double) 10);
		correctMockInventory.put("orange", (double) 10);
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
		
	}
	
	@Test
	//Unit test to test the getIngredientQuantity Method
	void testItemQuantityRetrieval() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);
		
		double appleQuantity = InventoryTester.getIngredientQuantity("apple");
		assertEquals(appleQuantity, 10.0);
		
		InventoryTester.addFood("apple", 5.0);
		appleQuantity = InventoryTester.getIngredientQuantity("apple");
		assertEquals(appleQuantity, 15.0);
		
	}
	
	@Test
	//Unit test to test the remove food method 
	void testRemovingRecipeInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);
		InventoryTester.removeFood("banana", 5.0);
		InventoryTester.removeFood("orange", 10.0);
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 5);
		correctMockInventory.put("apple", (double) 10);
	
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
		
	}
	
	@Test
	//Unit test to test the getAllInventory method
	void testGetAllInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);
		
		Set <String> mockIngredientList = new HashSet<String> ();
		mockIngredientList.add("banana");
		mockIngredientList.add("apple");
		mockIngredientList.add("orange");
		
		assertEquals(InventoryTester.getAllInventory(), mockIngredientList);
	}
	
	@Test
	//Unit test to test adding same ingredient
	void testAddingSameIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("banana", 10.0);
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
		correctMockInventory.put("banana", (double) 10);
	
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
		
	}
	
	@Test
	//Unit test to test removing same ingredient
	void testRemovingSameIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 25.0);
		InventoryTester.removeFood("banana", 5.0);
		InventoryTester.removeFood("banana", 10.0);
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
	
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
	}

}
