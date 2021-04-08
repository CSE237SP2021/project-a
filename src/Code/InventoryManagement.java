package Code;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;

import Code.User_Interface;

//add Recipe class with instance variables for what included in recipe as well as directions for the recipe
//add recipe objects to hashmap ** 
// make a private hashmap <Recipe, String> (string will be the name. Recipe will be recipe object
// add a method to inventory management-> if you want to add ingredients in a recipe 
//
//add addRecipeIngredients method to inventoryManagement class to be able to add the ingredients of Recipe to the fridge
// example recipe 

public class InventoryManagement {
	private HashMap <String, Double> ingredients = new HashMap <String, Double>();
	private List <String> recipes = new LinkedList <String>();
	private static InventoryManagement manager = new InventoryManagement();
	public InventoryManagement () {
		
	}
	
	
	public static InventoryManagement getInstance() {
		return manager;
	}
	
	public void addFood(String ingredientName, Double amount) {
		if (ingredients.containsKey(ingredientName)) {
			Double amountinInventory = ingredients.get(ingredientName);
			amount = amountinInventory+amount;
			ingredients.put(ingredientName, amount);
		}
		else {
			ingredients.put(ingredientName, amount);
		}	
	}

	
	public String getNumberofFood() {
		return "You havea total of" + ingredients.size() + "different ingredients in your fridge";
	}
	
	public double getIngredientQuantity( String ingredientName) {
		if (ingredients.containsKey(ingredientName)) {
		return ingredients.get(ingredientName);
		}
		else {
			return 0;
		}
	}
	
	
	public Set<String> getAllInventory() {
		return ingredients.keySet();
	}
	 
	
	public void removeFood(String ingredientName, Double amount) {
		if (ingredients.containsKey(ingredientName)) {
			Double amountinFridge = ingredients.get(ingredientName);
			amount = amountinFridge - amount; 
			if (amount == 0.0) {
				ingredients.remove(ingredientName);
			}
			else {
				ingredients.put(ingredientName, amount);
			}
		}
		else {
			System.out.println("Error: There is no ingredient with that name!");
		}
	}
	public static void main(String[] args){
		User_Interface UI= new User_Interface();
		UI.run();
				
	}
	

	

}
