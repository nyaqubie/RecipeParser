import Dictionary.Dictionary;
import Dictionary.DictionaryBuilder;
import Recipe.Recipe;

import java.io.IOException;

public class parser {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        System.out.println("hi");

        DictionaryBuilder myDB = new DictionaryBuilder();
        Dictionary myDictionary = myDB.buildDictionary("data");

        Recipe myRecipe = Recipe.parseRecipeFile("recipes/WorldsBestLasagna.txt");
        System.out.println(myRecipe);
        myDictionary.tagRecipe(myRecipe);
        System.out.println(myRecipe);
    }

    public void readDictionaries(String aDirectory){
        
    }

}
