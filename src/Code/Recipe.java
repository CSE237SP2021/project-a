package Code;

import java.util.LinkedList;

public class Recipe {
	
	private String instructions; 
	private LinkedList<String> ingredients;
	private int recipeDuration; 
    private boolean isRecipeAdvanced; 
    
    public Recipe(String instructions, LinkedList<String> ingredients, int recipeDuration, boolean isRecipeAdvanced) {
    	this.instructions = instructions; 
    	this.ingredients = ingredients; 
    	this.recipeDuration = recipeDuration; 
    	this.isRecipeAdvanced = isRecipeAdvanced; 
    }
    
    public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public LinkedList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(LinkedList<String> ingredients) {
		this.ingredients = ingredients;
	}

	public int getRecipeDuration() {
		return recipeDuration;
	}

	public void setRecipeDuration(int recipeDuration) {
		this.recipeDuration = recipeDuration;
	}

	public boolean isRecipeAdvanced() {
		return isRecipeAdvanced;
	}

	public void setRecipeAdvanced(boolean isRecipeAdvanced) {
		this.isRecipeAdvanced = isRecipeAdvanced;
	}


}
