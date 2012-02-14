package Dictionary;

import Recipe.RecipeLine;

import java.util.HashSet;
import java.util.Set;

class SubDictionary {
        private final String theCategory;
        private final String theLabel;
        private final Set<String> theEntries;

        SubDictionary(String aCategory, String aLabel) {
            theCategory = aCategory;
            theLabel = aLabel;
            theEntries = new HashSet<String>();
        }

        public String getLabel() {
            return theLabel;
        }

        public void addEntry(String aEntry){
            theEntries.add(aEntry);
        }

        public Set<String> getEntries() {
            return theEntries;
        }

        public void check(RecipeLine aLine){
            for (String aEntry : theEntries){
                if (aLine.getLine().toLowerCase().contains(aEntry))
                    aLine.tag(theCategory + " -- " + theLabel + " -- " + aEntry);
            }
        }
    }
