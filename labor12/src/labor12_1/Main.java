package labor12_1;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        DictionaryService service1 = new DictionaryService(DictionaryType.ARRAY_LIST);
        service1.findWordsFile("bible.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds with ArrayList: " + timeElapsed / 1000000);
        System.out.println();

        startTime = System.nanoTime();
        DictionaryService service2 = new DictionaryService(DictionaryType.TREE_SET);
        service2.findWordsFile("bible.txt");
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds with TreeSet: " + timeElapsed / 1000000);
        System.out.println();

        startTime = System.nanoTime();
        DictionaryService service3 = new DictionaryService(DictionaryType.HASH_SET);
        service3.findWordsFile("bible.txt");
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds with HashSet: " + timeElapsed / 1000000);
    }
}
