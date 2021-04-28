package Code;

import java.util.LinkedList;
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
		RecipeBook Book= new RecipeBook();
		selection currentSelection= selection.MainMenu;
		Scanner in = new Scanner(System.in);
		System.out.println("Press Any Key to Begin");
		String s = in.nextLine();
		populateRecipeBook(Book);
		
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
				currentSelection=selectionRecipe(in,currentSelection);

				break;
			case ShowRecipe:
				Book.listRecipes();
				currentSelection= selection.MainMenu;
				break;

			case AddRecipe:
				Book.addRecipe(createNewRecipe(in, Book));
				
				currentSelection= selection.MainMenu;
				break;
				
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
	public void addPBJRecipe(RecipeBook Book) {
		
		//String instructions, LinkedList<String> ingredients, int recipeDuration, boolean isRecipeAdvanced
		LinkedList<String> PBJtestIngredients = new LinkedList<String>();
		PBJtestIngredients.add("peanut butter");
		PBJtestIngredients.add("jelly");
		PBJtestIngredients.add("bread");
		
		Recipe PBJ = new Recipe("PBJ","Spread peanut butter on a slice of bread. Spread jelly on another slice of bread. "
				+ "Put the two slides together, with the pb and jelly sides facing each other.",PBJtestIngredients,10, false );
		Book.addRecipe(PBJ);
		return;
	}
	public void addChickenSoupRecipe(RecipeBook Book) {
		LinkedList<String> ChickenSoupIngredients = new LinkedList<String>();
		ChickenSoupIngredients.add("Chicken Broth");
		ChickenSoupIngredients.add("Chicken");
		ChickenSoupIngredients.add("Noodles");
		ChickenSoupIngredients.add("Carrots");
		ChickenSoupIngredients.add("Celery");
		
		Recipe ChickenSoup = new Recipe("Chicken Soup","Heat oil. Add carrots, celery, and Onion. Then Broth and chicken. And cook mmmmm.",ChickenSoupIngredients,30, true );
		Book.addRecipe(ChickenSoup);
		return;
	}
	public void addFancySteakRecipe(RecipeBook Book) {
		LinkedList<String> FancySteakIngredients = new LinkedList<String>();
		FancySteakIngredients.add("Beef");
		FancySteakIngredients.add("Garlic");
		FancySteakIngredients.add("Butter");
		
		Recipe FancySteak = new Recipe("Fancy Steak", "Heat stove. Add Garlic. Add steak. Cook until medium rare(about 10 min. Add Butter on top",FancySteakIngredients,30, true );
		
		Book.addRecipe(FancySteak);
		return;
		
	}	
	public void populateRecipeBook(RecipeBook Book) {
		addPBJRecipe(Book);
		addChickenSoupRecipe(Book);
		addFancySteakRecipe(Book);
		return;
	}
	public Recipe createNewRecipe(Scanner in, RecipeBook Book) {
		LinkedList<String> Ingredients= new LinkedList<String>();
		System.out.println("Enter Name of Recipe");
		String name= in.nextLine();
		
		
		Ingredients = collectNewIngredients( in,  Book,  Ingredients);
		
		
		System.out.println("Enter directions");
		String directions= in.nextLine();
		
		System.out.println("Input Duration");
		int Duration= in.nextInt();
		in.nextLine();
		
		Recipe newRecipe= new Recipe(name,directions, Ingredients, 10, true);
		
		return newRecipe;
	}
	
	public LinkedList<String> collectNewIngredients(Scanner in, RecipeBook Book, LinkedList<String> Ingredients) {
		boolean incomingIngredient= true;
		while(incomingIngredient) {
			System.out.println("Enter New Ingredients");
			String newIngredient = in.nextLine();
			
			if(newIngredient.equals(" ")) {
				incomingIngredient=false;
				
			}
			
			
			
			Ingredients.add(newIngredient);
			
		}
		return Ingredients;
	}
		
	
	

	public static void main(String[] args){
		User_Interface UI= new User_Interface();
		UI.run();
		System.out.println();

	}
}









