package generic;

public class GenericDemo2 {
    public static void main(String[] args) {
        NotePad<String, Integer> notePad = new NotePad<String, Integer>();
        notePad.setKey("Tom");
        notePad.setValue(29);
        System.out.println(notePad.getKey());
        System.out.println(notePad.getValue());
    }
}

class NotePad<K, V> {
    private K key;
    private V value;

    K getKey() {
        return key;
    }

    void setKey(K key) {
        this.key = key;
    }

    V getValue() {
        return value;
    }

    void setValue(V value) {
        this.value = value;
    }
}
