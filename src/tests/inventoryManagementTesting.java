package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import Code.InventoryManagement;
import Code.Recipe;

class inventoryManagementTesting {


	//Unit test to test the addFood method
	@Test
	void testAddingRecipeInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);

		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", 10.0);
		correctMockInventory.put("apple", 10.0);
		correctMockInventory.put("orange", 10.0);

		System.out.println(InventoryTester.printInventory());
		assertEquals(InventoryTester.printInventory().getClass(), correctMockInventory.values().getClass());
		assertEquals(InventoryTester.printInventory().size(), correctMockInventory.values().size());


		assertTrue(InventoryTester.printInventory().size() == correctMockInventory.values().size());
		assertTrue( InventoryTester.printInventory().containsAll(correctMockInventory.values()) 
				&& correctMockInventory.values().containsAll(InventoryTester.printInventory()));
	}

	//Unit test to test the getIngredientQuantity Method
	@Test
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
	//Unit test to test the remove food method 
	@Test
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

		assertEquals(InventoryTester.printInventory().getClass(), correctMockInventory.values().getClass());
		assertEquals(InventoryTester.printInventory().size(), correctMockInventory.values().size());


		assertTrue(InventoryTester.printInventory().size() == correctMockInventory.values().size());
		assertTrue( InventoryTester.printInventory().containsAll(correctMockInventory.values()) 
				&& correctMockInventory.values().containsAll(InventoryTester.printInventory()));
	}




	//Unit test to test the getAllInventory method
	@Test
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

	//Unit test to test adding same ingredient
	@Test
	void testAddingSameIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("banana", 10.0);

		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 20);




		assertEquals(InventoryTester.printInventory().getClass(), correctMockInventory.values().getClass());
		assertEquals(InventoryTester.printInventory().size(), correctMockInventory.values().size());


		assertTrue(InventoryTester.printInventory().size() == correctMockInventory.values().size());
		assertTrue( InventoryTester.printInventory().containsAll(correctMockInventory.values()) 
				&& correctMockInventory.values().containsAll(InventoryTester.printInventory()));
	}
	//Unit test to test removing same ingredient
	@Test
	void testRemovingSameIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 25.0);
		InventoryTester.removeFood("banana", 5.0);
		InventoryTester.removeFood("banana", 10.0);

		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);

		assertEquals(InventoryTester.printInventory().getClass(), correctMockInventory.values().getClass());
		assertEquals(InventoryTester.printInventory().size(), correctMockInventory.values().size());


		assertTrue(InventoryTester.printInventory().size() == correctMockInventory.values().size());
		assertTrue( InventoryTester.printInventory().containsAll(correctMockInventory.values()) 
				&& correctMockInventory.values().containsAll(InventoryTester.printInventory()));
	}

	//Unit test to test adding ingredient with zero items
	@Test
	void testAddingZeroIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("banana", 0.0);

		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);

		assertEquals(InventoryTester.printInventory().getClass(), correctMockInventory.values().getClass());
		assertEquals(InventoryTester.printInventory().size(), correctMockInventory.values().size());


		assertTrue(InventoryTester.printInventory().size() == correctMockInventory.values().size());
		assertTrue( InventoryTester.printInventory().containsAll(correctMockInventory.values()) 
				&& correctMockInventory.values().containsAll(InventoryTester.printInventory()));
	}

	//Unit test to test removing ingredient with zero items
	@Test
	void testRemovingZeroIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.removeFood("banana", 0.0);

		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);

		assertEquals(InventoryTester.printInventory().getClass(), correctMockInventory.values().getClass());
		assertEquals(InventoryTester.printInventory().size(), correctMockInventory.values().size());


		assertTrue(InventoryTester.printInventory().size() == correctMockInventory.values().size());
		assertTrue( InventoryTester.printInventory().containsAll(correctMockInventory.values()) 
				&& correctMockInventory.values().containsAll(InventoryTester.printInventory()));
	}


}


