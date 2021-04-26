package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.junit.jupiter.api.Test;

import Code.InventoryManagement;
import Code.Recipe;

class recipeTesting {


	@Test
<<<<<<< HEAD
	//Unit test to test the addFood method
	void testAddingRecipeInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);
=======
	void testSetIngredients() {
		LinkedList<String> testIngredients = new LinkedList<String>();
		testIngredients.add("peanut butter");
		testIngredients.add("jelly");
		testIngredients.add("bread");
		Recipe RecipeTester = new Recipe(null,null, null, 0, false);
		RecipeTester.setIngredients(testIngredients);
>>>>>>> branch 'RecipeBook' of https://github.com/CSE237SP2021/project-a.git
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
		correctMockInventory.put("apple", (double) 10);
		correctMockInventory.put("orange", (double) 10);
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
		
	}

	@Test
<<<<<<< HEAD
	//Unit test to test the getIngredientQuantity Method
	void testItemQuantityRetrieval() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);
=======
	void testGetIngredients() {
		LinkedList<String> PBJingredients = new LinkedList<String>();
		PBJingredients.add("peanut butter");
		PBJingredients.add("jelly");
		PBJingredients.add("bread");
		Recipe RecipeTester = new Recipe(null,null, PBJingredients, 0, false);
>>>>>>> branch 'RecipeBook' of https://github.com/CSE237SP2021/project-a.git
		
		double appleQuantity = InventoryTester.getIngredientQuantity("apple");
		assertEquals(appleQuantity, 10.0);
		
		InventoryTester.addFood("apple", 5.0);
		appleQuantity = InventoryTester.getIngredientQuantity("apple");
		assertEquals(appleQuantity, 15.0);
		
	}
	
	@Test
<<<<<<< HEAD
	//Unit test to test the remove food method 
	void testRemovingRecipeInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);
		InventoryTester.removeFood("banana", 5.0);
		InventoryTester.removeFood("orange", 10.0);
=======
	void testSetRecipeDuration() {
		Recipe RecipeTester = new Recipe(null,null, null, 0, false);
		int testDuration = 10;
		RecipeTester.setRecipeDuration(testDuration);
>>>>>>> branch 'RecipeBook' of https://github.com/CSE237SP2021/project-a.git
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 5);
		correctMockInventory.put("apple", (double) 10);
	
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
		
	}
	
	@Test
<<<<<<< HEAD
	//Unit test to test the getAllInventory method
	void testGetAllInventory() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("apple", 10.0);
		InventoryTester.addFood("orange", 10.0);
=======
	void testGetRecipeDuration() {
		Recipe RecipeTester = new Recipe(null,null, null, 10, false);
		int testDuration = RecipeTester.getRecipeDuration();
>>>>>>> branch 'RecipeBook' of https://github.com/CSE237SP2021/project-a.git
		
		Set <String> mockIngredientList = new HashSet<String> ();
		mockIngredientList.add("banana");
		mockIngredientList.add("apple");
		mockIngredientList.add("orange");
		
		assertEquals(InventoryTester.getAllInventory(), mockIngredientList);
	}
	
	@Test
<<<<<<< HEAD
	//Unit test to test adding same ingredient
	void testAddingSameIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("banana", 10.0);
=======
	void testSetInstructions() {
		Recipe RecipeTester = new Recipe(null,null, null, 0, false);
		String testInstructions = "Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. Put the two slides together, with the pb and jelly sides facing each other.";
		RecipeTester.setInstructions(testInstructions);
>>>>>>> branch 'RecipeBook' of https://github.com/CSE237SP2021/project-a.git
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
		correctMockInventory.put("banana", (double) 10);
	
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
		
	}
	
	@Test
<<<<<<< HEAD
	//Unit test to test removing same ingredient
	void testRemovingSameIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 25.0);
		InventoryTester.removeFood("banana", 5.0);
		InventoryTester.removeFood("banana", 10.0);
=======
	void testGetInstructions() {
		String testInstructions = "Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. Put the two slides together, with the pb and jelly sides facing each other.";
		Recipe RecipeTester = new Recipe(null,testInstructions, null, 0, false);
>>>>>>> branch 'RecipeBook' of https://github.com/CSE237SP2021/project-a.git
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
	
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
	}
	
	@Test
	//Unit test to test adding ingredient with zero items
	void testAddingZeroIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.addFood("banana", 0.0);
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
		
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
	}
	
	@Test
	//Unit test to test removing ingredient with zero items
	void testRemovingZeroIngredient() {
		InventoryManagement InventoryTester = new InventoryManagement();
		InventoryTester.addFood("banana", 10.0);
		InventoryTester.removeFood("banana", 0.0);
		
		HashMap <String, Double> correctMockInventory = new HashMap <String, Double> ();
		correctMockInventory.put("banana", (double) 10);
	
		assertEquals(InventoryTester.getInstance(), correctMockInventory);
	}
	
	@Test
	void testPopulatingRecipeBook() {
		InventoryManagement InventoryTester = new InventoryManagement(); 
		LinkedList ingredients = new LinkedList(); 
		int recipeDuration = 5; 
		boolean isRecipeAdvanced = false; 
		Recipe PBJ = new Recipe ("", ingredients, recipeDuration, false);
		InventoryTester.populateRecipeBook("link", PBJ);
	}
	
	@Test
	void testSuggestingRecipes(){
		InventoryManagement InventoryTester = new InventoryManagement(); 
		
	}

}
