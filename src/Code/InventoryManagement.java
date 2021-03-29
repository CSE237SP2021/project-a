package Code;

import java.util.HashMap;
import java.util.Set;

import Code.User_Interface;

public class InventoryManagement {
	private HashMap <String, Double> ingredients;
	public InventoryManagement () {
		
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
	}
	public static void main(String[] args){
		User_Interface UI= new User_Interface();
		UI.run();
				
	}
	

	

}
