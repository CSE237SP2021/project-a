package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import Code.Recipe;


public class RecipeTesting {
	
	//Unit test to test setIngredients method
	@Test
	void testSetIngredients() {
		LinkedList<String> testIngredients = new LinkedList<String>();
		testIngredients.add("peanut butter");
		testIngredients.add("jelly");
		testIngredients.add("bread");
		Recipe RecipeTester = new Recipe(null,null, null, 0, false);
		RecipeTester.setIngredients(testIngredients);
		
		LinkedList<String> PBJingredients = new LinkedList<String>();
		PBJingredients.add("peanut butter");
		PBJingredients.add("jelly");
		PBJingredients.add("bread");
		
		assertEquals(RecipeTester.getIngredients(), PBJingredients);
	}

	//Unit test to test getIngredients method
	@Test
	void testGetIngredients() {
		LinkedList<String> PBJingredients = new LinkedList<String>();
		PBJingredients.add("peanut butter");
		PBJingredients.add("jelly");
		PBJingredients.add("bread");
		Recipe RecipeTester = new Recipe(null,null, PBJingredients, 0, false);
		
		LinkedList<String> testIngredients = new LinkedList<String>();
		testIngredients = RecipeTester.getIngredients();
		
		assertTrue(testIngredients == PBJingredients);
	}
	
	//Unit test to test setRecipeDuration method
	@Test
	void testSetRecipeDuration() {
		Recipe RecipeTester = new Recipe(null,null, null, 0, false);
		int testDuration = 10;
		RecipeTester.setRecipeDuration(testDuration);
		
		assertTrue(RecipeTester.getRecipeDuration() == testDuration);
	}
	
	//Unit test to test getRecipeDuration method
	@Test
	void testGetRecipeDuration() {
		Recipe RecipeTester = new Recipe(null,null, null, 10, false);
		int testDuration = RecipeTester.getRecipeDuration();
		
		assertTrue(testDuration == 10);
	}
	
	//Unit test to test setInstructions method
	@Test
	void testSetInstructions() {
		Recipe RecipeTester = new Recipe(null,null, null, 0, false);
		String testInstructions = "Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. Put the two slides together, with the pb and jelly sides facing each other.";
		RecipeTester.setInstructions(testInstructions);
		
		String PBJinstructions = "Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. Put the two slides together, with the pb and jelly sides facing each other.";
		
		assertEquals(RecipeTester.getInstructions(), PBJinstructions);
	}
	
	//Unit test to test getInstructions method
	@Test
	void testGetInstructions() {
		String testInstructions = "Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. Put the two slides together, with the pb and jelly sides facing each other.";
		Recipe RecipeTester = new Recipe(null,testInstructions, null, 0, false);
		
		String PBJinstructions = "Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. Put the two slides together, with the pb and jelly sides facing each other.";
		
		assertTrue(RecipeTester.getInstructions() == PBJinstructions);
	}
}
