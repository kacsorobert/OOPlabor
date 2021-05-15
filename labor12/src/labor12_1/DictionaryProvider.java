package labor12_1;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType type) {
        IDictionary dictionary = switch (type) {
            case ARRAY_LIST -> ArrayListDictionary.newInstance();
            case HASH_SET -> HashSetDictionary.newInstance();
            case TREE_SET -> TreeSetDictionary.newInstance();
        };
        return dictionary;
    }
}
