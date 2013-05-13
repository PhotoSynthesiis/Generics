package generic;

public class GenericDemo9 {
    public static void main(String[] args) {
        Inner<String, Integer> inner = new Inner<String, Integer>();
        inner.setKey("inner key");
        inner.setValue(123);

        Outer<Inner> outer = new Outer<Inner>(inner);
        System.out.println(outer.getInner());
    }
}

class Inner<K, V> {
    private K key;
    private V value;

    void setKey(K key) {
        this.key = key;
    }

    void setValue(V value) {
        this.value = value;
    }

    public String toString() {
        return key + " " + value;
    }
}

class Outer<I> {
    private I inner;

    Outer(I inner) {
        this.inner = inner;
    }

    I getInner() {
        return inner;
    }

}

