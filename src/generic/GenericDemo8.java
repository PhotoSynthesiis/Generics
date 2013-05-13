package generic;

public class GenericDemo8 {
    public static void main(String[] args) {
        Integer[] integers = fun(1, 2, 3, 4, 5, 6, 7);
        print(integers);
    }

    private static <T> void print(T...arg) {
        for (T t : arg) {
            System.out.println(t);
        }
    }

    private static <T extends Number> T[] fun(T... arg) {
        return arg;
    }
}
