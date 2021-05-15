package labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType type) {
        this.dictionary=DictionaryProvider.createDictionary(type);
    }

    public boolean findWord(String word){
        return dictionary.find(word);
    }

    public IDictionary findWordsFile(String fileName){
        try (Scanner scanner=new Scanner(new File(fileName))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringTokenizer strtok=new StringTokenizer(line," ,.:;()?!'-");
                while(strtok.hasMoreTokens()){
                    dictionary.find(strtok.nextToken().toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found:"+fileName);
            System.exit(1);
        }
        return dictionary;
    }
}
