package labor8_2;

public interface IDictionary {
    final String DICTIONARY_FILE="dict.txt";
    public boolean add(String word);
    public boolean find(String word);
    public int size();
}
