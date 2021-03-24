package Code;

import java.util.Scanner;

public class User_Interface {
	
	
	
	public enum selection{
		MainMenu,
		InventoryManagement,
		AddInventory,
		RemoveInventory,
		CheckInventory,
		Recipes,
		ShowRecipe
		
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
	    	   
	    	   
	    	   s = in.nextLine();
	    	   
	    	   if(s.equals("Inventory Management")) {
	    		   
	    		   currentSelection= selection.InventoryManagement;
	    		 
	    	   }
	    	   else if(s== "Recipes") {
	    		   currentSelection = selection.Recipes;
	    		
	    	   }
	    	   else {
	    	   
	    	   System.out.println("1. Inventory Management");
	    	   System.out.println("2. Recipes");
	    	   }
	    	  
	    	  
	    	   break;
	    	   
	    	   
	       case InventoryManagement:
	    	   
	    	   System.out.println("1. Add Inventory");
	    	   System.out.println("2. Remove Inventory");
	    	   System.out.println("3. Check Inventory");
	    	   
	    	   s = in.nextLine();
	    	   
	    	   if(s.equals("Add Inventory")) {
	    		   currentSelection= selection.AddInventory;
	    	   }
	    	   if(s.equals("Remove Inventory")) {
	    		   currentSelection = selection.RemoveInventory;
	    	   }
	    	   if(s.equals("Check Inventory")) {
	    		   currentSelection = selection.CheckInventory;
	    	   }
	       
	    	   break;
	    	   
	       case AddInventory:
	    	   System.out.println("Enter name of ingredient");
	    	   String ingredientAdd =in.next();
	    	   
	    	   System.out.println("Enter Quantity");
	    	   double quantityAdd= in.nextDouble();
	    	   
	    	   
	    	   break;
	    	   
	       case RemoveInventory:
	    	   System.out.println("Enter name of ingredient");
	    	   String ingredientRemove =in.next();
	    	   
	    	   System.out.println("Enter Quantity");
	    	   double quantityRemove= in.nextDouble();
	    	   
	    	   
	    	   break;
	       
	    	   
	       case CheckInventory:
	    	   System.out.println("Here are the ingredients in your pantry");
	    	   
	    	   break;
	       case Recipes:
	    	   System.out.println("1. ShowRecipes");
	    	   if (s == "ShowRecipes") {
	    		   currentSelection= selection.ShowRecipe;
	    	   }
	    	   break;
	       }
	       
	       
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		User_Interface UI= new User_Interface();
		UI.run();
				
	}
}
	
	
	
	
	
	
	


