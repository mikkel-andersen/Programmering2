package HashMap;

import java.util.HashMap;
import java.util.Map;


public class SkabelonHashMap {
    private Map<Integer, String> map;

    public SkabelonHashMap() {
        map = new HashMap<>();
    }

    public void addElement(int key, String value) {
        map.put(key, value);
    }

    public String getElement(int key) {
        return map.get(key);
    }
}
