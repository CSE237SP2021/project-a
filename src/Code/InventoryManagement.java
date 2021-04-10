package Code;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import Code.User_Interface;

//add Recipe class with instance variables for what included in recipe as well as directions for the recipe
//add recipe objects to hashmap
//add addRecipeIngredients method to inventoryManagement class to be able to add the ingredients of Recipe to the fridge


public class InventoryManagement {
	
	private HashMap <String, Double> ingredients = new HashMap <String, Double>();
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
		return "You have a total of" + ingredients.size() + "different ingredients in your fridge.";
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
	public Collection<Double> printInventory() {
		
		return ingredients.values();
	}
	public String inventoryString() {
		return ingredients.toString();
	}
	
	public static void main(String[] args){
		User_Interface UI= new User_Interface();
		UI.run();
				
	}
	

	

}
