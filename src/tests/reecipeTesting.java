package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set; 
class reecipeTesting {

	@Test
	//Unit test to test the addFood method
	void testAddingRecipeInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10);
		InventoryTester.addFood("apple", 10);
		InventoryTester.addFood("orange", 10);
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
		correctMockInventory.put("apple", (double) 10);
		correctMockInventory.put("orange", (double) 10);
		assertEquals(InventoryTester.ingredients, correctMockInventory);
		
	}
	
	@Test
	//Unit test to test the getIngredientQuantity Method
	void testItemQuantityRetrieval() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10);
		InventoryTester.addFood("apple", 10);
		InventoryTester.addFood("orange", 10);
		
		double appleQuantity = InventoryTester.getIngredientQuantity("apple");
		assertEquals(appleQuantity, 10.0);
		
		InventoryTester.addFood("apple", 5);
		appleQuantity = InventoryTester.getIngredientQuantity("apple");
		assertEquals(appleQuantity, 15.0);
		
	}
	
	@Test
	//Unit test to test the remove food method 
	void testRemovingRecipeInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10);
		InventoryTester.addFood("apple", 10);
		InventoryTester.addFood("orange", 10);
		InventoryTester.removeFood("banana", 5);
		InventoryTester.removeFood("orange", 10);
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 5);
		correctMockInventory.put("apple", (double) 10);
	
		assertEquals(InventoryTester.ingredients, correctMockInventory);
		
	}
	
	@Test
	//Unit test to test the getAllInventory method
	void testGetAllInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10);
		InventoryTester.addFood("apple", 10);
		InventoryTester.addFood("orange", 10);
		
		Set <String> mockIngredientList = new HashSet<String> ();
		mockIngredientList.add("banana");
		mockIngredientList.add("apple");
		mockIngredientList.add("orange");
		
		assertEquals(InventoryTester.getAllInventory(), mockIngredientList);
	}
	
	
	
	

}
