package labor12_1;

public interface IDictionary {
    final String DICTIONARY_FILE="bible.txt";
    public boolean add(String word);
    public boolean find(String word);
    public int size();
}
