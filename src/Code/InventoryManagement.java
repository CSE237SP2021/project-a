package Code;

import java.util.HashMap;
import java.util.Set;

import Code.User_Interface;

public class InventoryManagement {
	//HashMap instance variable represents inventory in fridge
	private HashMap <String, Double> ingredients = new HashMap <String, Double>();
	private static InventoryManagement manager = new InventoryManagement();
	public InventoryManagement () {
		
	}
	//method returns instance of Inventory with HashMap instance variable
	public static InventoryManagement getInstance() {
		return manager;
	}
	
	//method allows user to add to inventory
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

	
	//method returns the total number of unique ingredients in your fridge
	public String getNumberofFood() {
		return "You have a total of" + ingredients.size() + "different ingredients in your fridge.";
	}
	
	//method returns the quantify of a specific ingredient in fridge
	public double getIngredientQuantity( String ingredientName) {
		if (ingredients.containsKey(ingredientName)) {
		return ingredients.get(ingredientName);
		}
		else {
			return 0;
		}
	}
	
	//method returns the set of all ingredient names
	public Set<String> getAllInventory() {
		return ingredients.keySet();
	}
	 
	
	//method allows user to remove ingredients from the inventory
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
