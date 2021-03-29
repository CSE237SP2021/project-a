package Code;

import java.util.Scanner;
import java.util.Set;

import Code.InventoryManagement;

public class User_Interface {
	
	
	
	public enum selection{
		MainMenu,
		InventoryManagement,
		AddInventory,
		RemoveInventory,
		CheckInventory,
		Recipes,
		ShowRecipe, 
		Quit
		
	}
	
	public void run() {
		
		selection currentSelection= selection.MainMenu;
		Scanner in = new Scanner(System.in);
		System.out.println("Press Any Key to Begin");
		String s = in.nextLine();
		while(true) {
	        
	       switch(currentSelection) {
	       
	       case MainMenu:
	    	   
	    	   System.out.println("1. Inventory Management");
	    	   System.out.println("2. Recipes");
	    	   System.out.println("3. Quit Out");
	    	   
	    	   
	    	   s = in.nextLine();
	    	   
	    	   if(s.equals("1")) {
	    		   
	    		   currentSelection= selection.InventoryManagement;
	    		 
	    	   }
	    	   else if(s.equals("2")) {
	    		   currentSelection = selection.Recipes;
	    		
	    	   }
	    	   else if(s.equals("3")) {
	    		   currentSelection = selection.Quit;
	    		
	    	   }
	    	   else {
	    	   
	    	   System.out.println("1. Inventory Management");
	    	   System.out.println("2. Recipes");
	    	   System.out.println("3. Quit Out");
	    	   }
	   
	    	  
	    	   break;
	    	   
	    	   
	       case InventoryManagement:
	    	   
	    	   System.out.println("1. Add Inventory");
	    	   System.out.println("2. Remove Inventory");
	    	   System.out.println("3. Check Inventory");
	    	   
	    	   s = in.nextLine();
	    	   
	    	   if(s.equals("1")) {
	    		   currentSelection= selection.AddInventory;
	    	   }
	    	   if(s.equals("2")) {
	    		   currentSelection = selection.RemoveInventory;
	    	   }
	    	   if(s.equals("3")) {
	    		   currentSelection = selection.CheckInventory;
	    	   }
	       
	    	   break;
	    	   
	       case AddInventory:
	    	   System.out.println("Enter name of ingredient");
	    	   String ingredientAdd =in.nextLine();
	    	   
	    	   System.out.println("Enter Quantity");
	    	   double quantityAdd= in.nextDouble();
	    	 
	    	  
	    	   InventoryManagement.getInstance().addFood(ingredientAdd, quantityAdd);
	    	   currentSelection = selection.MainMenu; 
	    	   break;
	    	   
	       case RemoveInventory:
	    	   System.out.println("Enter name of ingredient");
	    	   String ingredientRemove =in.next();
	    	   
	    	   System.out.println("Enter Quantity");
	    	   double quantityRemove= in.nextDouble();
	    	   InventoryManagement.getInstance().removeFood(ingredientRemove, quantityRemove);
	    	   currentSelection = selection.MainMenu;
	    	   
	    	   
	    	   break;
	       
	    	   
	       case CheckInventory:
	    	   System.out.println("Here are the ingredients in your pantry");
	    	   Set <String> ingredients = InventoryManagement.getInstance().getAllInventory();
	    	   ingredients.stream().forEach(elem -> System.out.print(elem + " "));
	    	   currentSelection = selection.MainMenu;
	    	   break;
	    	   
	       case Recipes:
	    	   System.out.println("1. ShowRecipes");
	    	   if (s == "ShowRecipes") {
	    		   currentSelection= selection.ShowRecipe;
	    	   }
	    	   break;
	    	   
	       case Quit:
	    	   System.out.println("Thanks for checking your inventory!");
	    	   return;
	       }
	       	    	   
			
			
		}
		
		
		
	}
	public static void main(String[] args){
		User_Interface UI= new User_Interface();
		UI.run();
				
	}
}
	

	
	
	
	
	


