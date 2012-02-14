package Dictionary;

import Recipe.Recipe;
import Recipe.RecipeLine;

import java.util.Map;
import java.util.Set;

public class Dictionary {
    private final Map<String, Set<String>> theCategoryMap;
    private final Map<String, SubDictionary> theSubDicts;

    Dictionary(Map<String, Set<String>> aCategoryMap, Map<String, SubDictionary> aSubDicts) {
        theCategoryMap = aCategoryMap;
        theSubDicts = aSubDicts;
    }

    public void tagRecipe(Recipe aRecipe){
        for (RecipeLine myLine : aRecipe.getIngredients())
            checkDictionariesAndTag(myLine);

        for (RecipeLine myLine : aRecipe.getInstructions())
            checkDictionariesAndTag(myLine);
    }

    public void checkDictionariesAndTag(RecipeLine aLine){
        for (SubDictionary mySubDictionary : theSubDicts.values())
            mySubDictionary.check(aLine);
    }
}
