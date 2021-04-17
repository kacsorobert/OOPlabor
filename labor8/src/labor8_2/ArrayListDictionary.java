package labor8_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words=new ArrayList<>();
    private static ArrayListDictionary instance;

    private ArrayListDictionary(){
        Scanner scanner=null;

        try {
            scanner=new Scanner(new File("dict.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: "+DICTIONARY_FILE);
            System.exit(1);
        }

        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            words.add(line.trim());
        }
    }

    public static IDictionary newInstance(){
        if(instance==null){
            instance=new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        if(find(word)){
            System.out.println("The word is already in the dictionary!");
            return false;
        }
        words.add(word);
        Collections.sort(words);
        return true;
    }

    @Override
    public boolean find(String word) {
        return Collections.binarySearch(words,word) >= 0;
    }

    @Override
    public int size() {
        return words.size();
    }
}
