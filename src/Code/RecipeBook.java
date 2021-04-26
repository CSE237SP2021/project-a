package Code;

import java.util.LinkedList;

public class RecipeBook {
	
	public LinkedList<Recipe> allRecipes= new LinkedList<Recipe>();
	
	public void addRecipe(Recipe a) {
		if (allRecipes.contains(a)) {
			return;
		}
		else
	
		allRecipes.add(a);
		
		
		return;
	}
	public void removeRecipe(Recipe a) {
		if (allRecipes.contains(a)) {
			allRecipes.remove(a);
		}
		return;
	}
	public boolean recipeContains(Recipe a) {
		return allRecipes.contains(a);
		
	}
	public LinkedList<String> listRecipes(){
		LinkedList<String> RecipeList = new LinkedList<String>();
		for(int i=0; i< allRecipes.size(); i++) {
			RecipeList.add(allRecipes.get(i).name());
			System.out.println(RecipeList.get(i));
		}
		return RecipeList;
	}
	
	
	public LinkedList<Recipe>  sortByIngredients(InventoryManagement Inventory, Recipe a) {

		
	
	}
	
}
