package labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words=new ArrayList<>();
    private static ArrayListDictionary instance;

    private ArrayListDictionary(){
        try (Scanner scanner=new Scanner(new File(DICTIONARY_FILE))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                StringTokenizer strtok=new StringTokenizer(line," ,.:;()?!'-");
                while(strtok.hasMoreTokens()){
                    add(strtok.nextToken().toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: "+DICTIONARY_FILE);
            System.exit(1);
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
