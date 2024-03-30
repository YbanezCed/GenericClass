package Map;

import java.util.ArrayList;

class MyMap<Key, Value> {
    private final ArrayList<Key> keys;
    private final ArrayList<Value> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(Key key, Value value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public Value get(Key key) {
        int index = keys.indexOf(key);
        return index != -1 ? values.get(index) : null;
    }

    public Value remove(Key key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            keys.remove(index);
            return values.remove(index);
        }
        return null;
    }
}
