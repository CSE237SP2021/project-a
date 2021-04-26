package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

import Code.Recipe;
import Code.RecipeBook;

public class RecipeBookTesting {
	
	
	@Test
	 public void TestAddRecipe() {
		RecipeBook Book= new RecipeBook();
		//String instructions, LinkedList<String> ingredients, int recipeDuration, boolean isRecipeAdvanced
		LinkedList<String> PBJtestIngredients = new LinkedList<String>();
		PBJtestIngredients.add("peanut butter");
		PBJtestIngredients.add("jelly");
		PBJtestIngredients.add("bread");
		
		Recipe PBJ = new Recipe("PBJ","Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. "
				+ "Put the two slides together, with the pb and jelly sides facing each other.",PBJtestIngredients,10, false );
		
		
		LinkedList<String> ChickenSoupIngredients = new LinkedList<String>();
		ChickenSoupIngredients.add("Chicken Broth");
		ChickenSoupIngredients.add("Chicken");
		ChickenSoupIngredients.add("Noodles");
		ChickenSoupIngredients.add("Carrots");
		ChickenSoupIngredients.add("Celery");
		
		Recipe ChickenSoup = new Recipe("Chicken Soup","Heat oil. Add carrots, celery, and Onion. Then Broth and chicken. And cook mmmmm.",ChickenSoupIngredients,30, true );
		
		
		LinkedList<String> FancySteakIngredients = new LinkedList<String>();
		FancySteakIngredients.add("Beef");
		FancySteakIngredients.add("Garlic");
		FancySteakIngredients.add("Butter");
		
		Recipe FancySteak = new Recipe("Fancy Steak", "Heat stove. Add Garlic. Add steak. Cook until medium rare(about 10 min. Add Butter on top",FancySteakIngredients,30, true );
		
		
		
				
		Book.addRecipe(PBJ);
		
		Book.addRecipe(ChickenSoup);
		Book.addRecipe(FancySteak);
		
	
		LinkedList<Recipe> testBook= new LinkedList<Recipe>();
		testBook.add(PBJ);
		testBook.add(ChickenSoup);
		testBook.add(FancySteak);
		
		assertEquals(testBook, Book.allRecipes);
		
	}
	@Test
	 public void TestRemoveRecipe() {
		RecipeBook Book= new RecipeBook();
		LinkedList<String> PBJtestIngredients = new LinkedList<String>();
		PBJtestIngredients.add("peanut butter");
		PBJtestIngredients.add("jelly");
		PBJtestIngredients.add("bread");
		
		Recipe PBJ = new Recipe("PBJ","Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. "
				+ "Put the two slides together, with the pb and jelly sides facing each other.",PBJtestIngredients,10, false );
		
		
		LinkedList<String> ChickenSoupIngredients = new LinkedList<String>();
		ChickenSoupIngredients.add("Chicken Broth");
		ChickenSoupIngredients.add("Chicken");
		ChickenSoupIngredients.add("Noodles");
		ChickenSoupIngredients.add("Carrots");
		ChickenSoupIngredients.add("Celery");
		
		Recipe ChickenSoup = new Recipe("Chicken Soup","Heat oil. Add carrots, celery, and Onion. Then Broth and chicken. And cook mmmmm.",ChickenSoupIngredients,30, true );
		
		
		LinkedList<String> FancySteakIngredients = new LinkedList<String>();
		FancySteakIngredients.add("Beef");
		FancySteakIngredients.add("Garlic");
		FancySteakIngredients.add("Butter");
		
		Recipe FancySteak = new Recipe("Fancy Steak", "Heat stove. Add Garlic. Add steak. Cook until medium rare(about 10 min. Add Butter on top",FancySteakIngredients,30, true );
		
		
		
				
		Book.addRecipe(PBJ);
		Book.addRecipe(FancySteak);
		Book.removeRecipe(PBJ);
		Book.removeRecipe(ChickenSoup);
		
		Book.listRecipes();
	
		LinkedList<Recipe> testBook= new LinkedList<Recipe>();
		
		testBook.add(FancySteak);
		
		assertEquals(testBook, Book.allRecipes);
		
	}
	
	@Test
	public void testSortByIngredient() {
		
	}
}
