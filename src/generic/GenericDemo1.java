package generic;

public class GenericDemo1 {
    public static void main(String[] args) {
        Point<String> point = new Point<String>();
        point.setVar("this is a test");
        System.out.println(point.getVar());
    }
}

class Point<T> {
    private T var;

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }
}
