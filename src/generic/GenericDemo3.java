package generic;

public class GenericDemo3 {
    public static void main(String[] args) {
        Info<String> info = new Info<String>();
        info.setVar("this is a test");

        fun(info);
    }

    private static void fun(Info<?> info) {
        System.out.println(info);
    }
}

class Info<T> {
    private T var;

    void setVar(T var) {
        this.var = var;
    }

    public String toString() {
        return var.toString();
    }
}
