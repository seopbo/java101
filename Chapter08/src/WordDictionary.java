import java.util.HashMap;

public class WordDictionary {
    HashMap<String, String> container = new HashMap<String, String>();

    public void addWord (String key, String value) {

        this.container.put(key.toLowerCase(), value);
    }

    public String find (String key) {
        return this.container.get(key.toLowerCase());
    }
}
