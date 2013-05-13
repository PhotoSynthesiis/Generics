package generic;

public class GenericDemo4 {
    public static void main(String[] args) {
        Apple<String, Double> apple = new Apple<String, Double>();
        apple.setColor("green");
        apple.setPrice(13.24);
        printColor(apple);
    }

    private static void printColor(Apple<? extends String, ? extends Number> apple) {
        System.out.println(apple);
    }
}

class Apple<T, K> {
    private T color;
    private K price;

    void setColor(T color) {
        this.color = color;
    }

    void setPrice(K price) {
        this.price = price;
    }

    public String toString() {
        return color.toString() + " " + price.toString();
    }
}
