package generic;

public class GenericDemo6 {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        System.out.println(toy1.getVar("Tom"));
        System.out.println(toy1.getVar(123));
    }
}

class Toy {
    public <T> T getVar(T t) {
        return t;
    }
}
