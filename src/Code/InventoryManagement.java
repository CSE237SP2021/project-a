package Code;

import java.util.ArrayList;

public class InventoryManagement {
	private String food;

	private ArrayList<InventoryManagement> items;
	
	public void Fridge (String food) {
		this.food = food;
		this.items = new ArrayList<InventoryManagement>();
		
	}
	public void addFood(InventoryManagement ingredientAdd) {
		items.add(ingredientAdd);
		
	}
	
	public int getNumberofFood() {
		return items.size();
	}
	
	
	public void removeFood(InventoryManagement ingredientRemove) {
		if (items.contains(ingredientRemove)== true) {
			items.remove(ingredientRemove);
		}
	}
			


// make inventory as an object that way we can access inventory given name 
// functions for the class (add/remove)
// inventory that runs for inventory to check inventory 

//
//	   String a = input.nextLine();
//	   list.add(a);
//
//	   System.out.println(Arrays.toString(list.toArray()))
//
//	   }
//
	

}
