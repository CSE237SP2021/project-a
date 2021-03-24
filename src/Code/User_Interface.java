package Washer;

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
		
		while(true) {
			  
	        String s = in.nextLine();
	      
	       switch(currentSelection) {
	       
	       case MainMenu:
	    	   System.out.println("1. InventoryManagement");
	    	   System.out.println("2. Recipes");
	    	   if(s=="InventoryManagement") {
	    		   currentSelection= selection.InventoryManagement;
	    	   }
	    	   if(s== "Recipes") {
	    		   currentSelection = selection.Recipes;
	    	   }
	    	   break;
	    	   
	    	   
	       case InventoryManagement:
	    	   
	    	   System.out.println("1. AddInventory");
	    	   System.out.println("2. RemoveInventory");
	    	   System.out.println("3. CheckInventory");
	    	   
	    	   if(s=="AddInventory") {
	    		   currentSelection= selection.AddInventory;
	    	   }
	    	   if(s== "RemoveInventory") {
	    		   currentSelection = selection.RemoveInventory;
	    	   }
	    	   if(s== "CheckInventory") {
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
	
	
	
	
	
	
	


