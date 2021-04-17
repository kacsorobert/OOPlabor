package labor8_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        IDictionary dict=new ArrayListDictionary();
//        System.out.println(dict.size());
//        dict.add("i");
//
//        Scanner scanner = new Scanner(System.in);
//        while( true ) {
//            System.out.print("Word to find ( Enter <end> for exit): ");
//            String word = scanner.nextLine();
//            if( word.equalsIgnoreCase( "end")){
//                break;
//            }
//            System.out.println(" Find(" + word + "): " + dict.find(word));
//        }

        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
        Scanner scanner = new Scanner(System.in);
        while( true ) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if( word.equalsIgnoreCase( "end")){
                break;
            }
            System.out.println(" Find(" + word + "): " + service.findWord(word));
        }
        System.out.println("Unknown words from a file: ");
        System.out.println( service.findWordsFile( "labor8/text_to_find.txt"));

    }
}
