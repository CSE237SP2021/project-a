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
	
//	public String listFoods() {
		//return Array.toString(list.toArray());
//		}
	
	public void removeFood(InventoryManagement ingredientRemove) {
		if (items.contains(ingredientRemove)== true) {
			items.remove(ingredientRemove);

			
			//user input 
//if user input matches something that is in the list of items 
//		remove it 
		// how to take account user input?
		
		
	//	if (items.contains(b)== input) {
//			items.remove(b);
		}
	}


//	   Import java.util.ArrayList
// make inventory as an object that way we can access inventory given name 
// functions for the class (add/remove)
// inventory that runs for inventory to check inventory 
//
//	   Public static void main (String args []) {
//	   List l = new ArrayList();
//
//	   String a = input.nextLine();
//	   list.add(a);
//
//	   System.out.println(Arrays.toString(list.toArray()))
//
//	   }
//
//
//	   Public static void main RemoveInventory (){
//	   (Take in input of what needs to be removed)
//
//	   If list.contains(b) == input {
//	    l.remove(a); 
//	   }
//
//
	

}
