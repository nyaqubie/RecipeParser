import Dictionary.Dictionary;
import Dictionary.DictionaryBuilder;
import Recipe.Recipe;
import Recipe.RecipeGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Array;

public class parser{
    final private Dictionary theDictionary;
    final private RecipeGUI theGUI;


	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
        System.out.println("hi");
        parser myParser = new parser();

//        final DictionaryBuilder myDB = new DictionaryBuilder();
//        final Dictionary myDictionary = myDB.buildDictionary("data");


//        Recipe myRecipe = Recipe.parseRecipeFile("recipes/WorldsBestLasagna.txt");
//        System.out.println(myRecipe);
//        myDictionary.tagRecipe(myRecipe);
//        System.out.println(myRecipe);
    }

    public parser() throws IOException {
        DictionaryBuilder myDB = new DictionaryBuilder();
        theDictionary = myDB.buildDictionary("data");


        theGUI = new RecipeGUI();
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        theGUI.getButtonParse().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parseRecipe(e);
            }
        });

        theGUI.pack();
        theGUI.setVisible(true);
    }

    private void parseRecipe(ActionEvent e) {
        System.out.println("Parsing Recipe..");
        Recipe myRecipe = Recipe.parseGUIForm(theGUI.getRecipeNameInput().getText(),
                theGUI.getRecipeMetaInput().getText(),
                theGUI.getRecipeIngInput().getText(),
                theGUI.getRecipeDirInput().getText());

        theDictionary.tagRecipe(myRecipe);

        theGUI.getOutputText().setText(myRecipe.toString());
    }

}
