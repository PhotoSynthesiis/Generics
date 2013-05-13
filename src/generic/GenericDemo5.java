package generic;

public class GenericDemo5 {
    public static void main(String[] args) {
        Fruit<String> fruit = new Pear<String>("pear");
        fruit.setColor("yellow");

        System.out.println(fruit);
    }
}

interface Fruit<T> {
    void setColor(T color);
}

class Pear<T> implements Fruit<T> {
    private T color;

    Pear(T color) {
        this.color = color;
    }

    @Override
    public void setColor(T color) {
        this.color = color;
    }

    public String toString() {
        return color.toString();
    }
}
