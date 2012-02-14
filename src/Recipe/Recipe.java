package Recipe;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String theName;
    private final List<String> theMetaData;
    private final List<RecipeLine> theIngredients;
    private final List<RecipeLine> theInstructions;

    public Recipe(String aName, List<String> aMetaData, List<RecipeLine> aIngredients, List<RecipeLine> aInstructions) {
        theName = aName;
        theMetaData = aMetaData;
        theIngredients = aIngredients;
        theInstructions = aInstructions;
    }

    public String getName() {
        return theName;
    }

    public List<String> getMetaData() {
        return theMetaData;
    }

    public List<RecipeLine> getIngredients() {
        return theIngredients;
    }

    public List<RecipeLine> getInstructions() {
        return theInstructions;
    }

    @Override
    public String toString() {
        StringBuilder mySB = new StringBuilder();

        mySB.append("Name: ").append(theName).append("\n\n")
                .append("MetaData:\n");

        for (String myLine : theMetaData)
            mySB.append(myLine).append("\n");

        mySB.append("\nIngredients:\n");
        for (RecipeLine myLine : theIngredients)
            mySB.append(myLine.toString()).append("\n\n");

        mySB.append("\nInstructions:\n");
        for (RecipeLine myLine : theInstructions)
            mySB.append(myLine.toString()).append("\n\n");

        return mySB.toString();
    }

    public static Recipe parseRecipeFile(String aFilePath) throws IOException {
        String myName;
        List<String> myMeta = new ArrayList<String>();
        List<RecipeLine> myIngr = new ArrayList<RecipeLine>();
        List<RecipeLine> myInst = new ArrayList<RecipeLine>();

        FileInputStream myFileStream = new FileInputStream(aFilePath);
	    DataInputStream myInputStream = new DataInputStream(myFileStream);
		BufferedReader myReader = new BufferedReader(new InputStreamReader(myInputStream));

        myName = aFilePath;
        String myLine = null;

        while ((myLine = myReader.readLine()) != null && !myLine.contains("MetaData:")){
        }

        while ((myLine = myReader.readLine()) != null && !myLine.contains("Ingredients:"))
            if (myLine.length() > 0)
                myMeta.add(myLine);

        while ((myLine = myReader.readLine()) != null && !myLine.contains("Instructions:"))
            if (myLine.length() > 0)
                myIngr.add(new RecipeLine(myLine));

        while ((myLine = myReader.readLine()) != null)
            if (myLine.length() > 0)
                myInst.add(new RecipeLine(myLine));

        return new Recipe(myName, myMeta, myIngr, myInst);
    }
}
