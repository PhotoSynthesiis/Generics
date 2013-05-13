package generic;

public class GenericDemo7 {
    public static void main(String[] args) {
        Demo<Integer> demo = fun(30);
        System.out.println(demo);
    }

    private static <T extends Number> Demo<T> fun(T param) {
        Demo<T> demo = new Demo<T>();
        demo.setVar(param);
        return demo;
    }
}

class Demo<T extends Number> {
    private T var;

    public void setVar(T var) {
        this.var = var;
    }

    public String toString() {
        return var.toString();
    }
}
