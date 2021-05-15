package labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TreeSetDictionary implements IDictionary{
    private Set<String> words=new TreeSet<>();
    private static TreeSetDictionary instance;

    private TreeSetDictionary() {
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
            instance=new TreeSetDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        return words.add(word);
    }

    @Override
    public boolean find(String word) {
        return words.contains(word);
    }

    @Override
    public int size() {
        return words.size();
    }
}
