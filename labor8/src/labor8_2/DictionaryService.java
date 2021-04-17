package labor8_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType type) {
        this.dictionary=DictionaryProvider.createDictionary(type);
    }

    public boolean findWord(String word){
        return dictionary.find(word);
    }

    public ArrayList<String> findWordsFile(String fileName){
        ArrayList<String> words=new ArrayList<>();
        Scanner scanner=null;

        try {
            scanner=new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found:"+fileName);
            System.exit(1);
        }

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] items = line.split(" ");
            for (String str : items) {
                if (!dictionary.find(str.trim())) {
                    words.add(str.trim());
                }
            }
        }
        return words;
    }
}
