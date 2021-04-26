package Code;

import java.util.Scanner;
import java.util.Set;



public class User_Interface {



	public enum selection{
		MainMenu,
		InventoryManagement,
		AddInventory,
		RemoveInventory,
		CheckInventory,
		Recipes,
		ShowRecipe, 
		AddRecipe,
		Quit

	}

	public void run() {

		selection currentSelection= selection.MainMenu;
		Scanner in = new Scanner(System.in);
		System.out.println("Press Any Key to Begin");
		String s = in.nextLine();
		while(true) {

			switch(currentSelection){
			case MainMenu:

				printMain();
				currentSelection = selectionMain(in,currentSelection);
				break;


			case InventoryManagement:

				printInventoryMenu();

				currentSelection = selectionInventory(in,s,currentSelection) ;

				break;

			case AddInventory:
				addtoInventory(in);
				currentSelection = selection.MainMenu; 
				break;

			case RemoveInventory:
				removefromInventory(in);
				currentSelection = selection.MainMenu;


				break;


			case CheckInventory:
				checkInventory();
				currentSelection= selection.MainMenu;
				break;

			case Recipes:

				printRecipeMenu();
				selectionRecipe(in,currentSelection);

				break;
			case ShowRecipe:


			case AddRecipe:

			case Quit:
				System.out.println("Thanks for checking your inventory!");
				break;


			}



		}



	}





	public void printMain() {

		System.out.println("1. Inventory Management");
		System.out.println("2. Recipes");
		System.out.println("3. Quit Out");

	}
	public selection selectionMain(Scanner in, selection currentSelection) {
		String s = in.nextLine();

		if(s.equals("1")) {
			currentSelection= selection.InventoryManagement;
		}
		else if(s.equals("2")) {
			currentSelection = selection.Recipes;
		}
		else if(s.equals("3")) {
			currentSelection = selection.Quit;
		}
		return currentSelection;
	}



	public void printInventoryMenu() {
		System.out.println("1. Add Inventory");
		System.out.println("2. Remove Inventory");
		System.out.println("3. Check Inventory");

	}
	public selection selectionInventory(Scanner in, String s, selection currentSelection) {
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
		return currentSelection;

	}
	public void addtoInventory(Scanner in) {
		System.out.println("Enter name of ingredient");
		String ingredientAdd =in.nextLine();

		System.out.println("Enter Quantity");
		double quantityAdd= in.nextDouble();


		InventoryManagement.getInstance().addFood(ingredientAdd, quantityAdd);
		String s = in.nextLine();

	}
	public void removefromInventory(Scanner in) {
		System.out.println("Enter name of ingredient");
		String ingredientRemove =in.next();

		System.out.println("Enter Quantity");
		double quantityRemove= in.nextDouble();

		InventoryManagement.getInstance().removeFood(ingredientRemove, quantityRemove);
		String s = in.nextLine();

	}
	public void checkInventory() {
		System.out.println("Here are the ingredients in your pantry");
		Set <String> ingredients = InventoryManagement.getInstance().getAllInventory();
		ingredients.stream().forEach(elem -> System.out.print(elem + " "+ InventoryManagement.getInstance().getIngredientQuantity(elem)+ '\n' ));
		//ingredients.stream().forEach(elem -> System.out.println( InventoryManagement.getInstance().getIngredientQuantity(elem)));
		System.out.println();

	}
	public void printRecipeMenu() {
		System.out.println("1. Check Recipes");
		System.out.println("2. Add Recipe");
	}
	public selection selectionRecipe(Scanner in, selection currentSelection) {
		String s = in.nextLine();

		if(s.equals("1")) {
			currentSelection= selection.ShowRecipe;
		}
		if(s.equals("2")) {
			currentSelection = selection.AddRecipe;
		}
		return currentSelection;

	}

	public static void main(String[] args){
		User_Interface UI= new User_Interface();
		UI.run();
		System.out.println();

	}
}









