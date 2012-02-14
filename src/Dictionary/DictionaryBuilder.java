package Dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DictionaryBuilder {

    // "data"
    public Dictionary buildDictionary(String aDirectoryName) throws IOException {
        Map<String, Set<String>> myCategoryMap = new HashMap<String, Set<String>>();
        Map<String, SubDictionary> mySubDicts = new HashMap<String, SubDictionary>();

        File myDirectory = new File(aDirectoryName);
		String[] myDirectories = myDirectory.list(); // Ingredient | Instruction | Object

        if (myDirectories == null)
            System.out.println("Not a directory");
        else {
            for (String mySubDirName : myDirectories){ // Foreach category
                if (!myCategoryMap.containsKey(mySubDirName))
                    myCategoryMap.put(mySubDirName, new HashSet<String>());

                File mySubDir = new File(aDirectoryName + "/" + mySubDirName);

                if (mySubDir.isDirectory()){

                    String[] myFilenames = mySubDir.list();
                    for (String myFile : myFilenames){
                        System.out.println("Reading file " + myFile.substring(0, myFile.indexOf(".")) + " in category " + mySubDirName);
                        myCategoryMap.get(mySubDirName).add(myFile);
                        SubDictionary mySubDictionary = new SubDictionary(mySubDirName.toLowerCase(), myFile.substring(0, myFile.indexOf(".")));

                        FileInputStream myFileStream = new FileInputStream(aDirectoryName + "/" + mySubDirName + "/" + myFile);
				        DataInputStream myInputStream = new DataInputStream(myFileStream);
				        BufferedReader myReader = new BufferedReader(new InputStreamReader(myInputStream));

                        String myLine = null;
                        while ((myLine = myReader.readLine()) != null){
                            mySubDictionary.addEntry(myLine.toLowerCase().replaceAll(",","").trim());
                        }

                        mySubDicts.put(myFile, mySubDictionary);
                    }
                }


            }
        }

        return new Dictionary(myCategoryMap, mySubDicts);
    }
}
