@java.lang.FunctionalInterface
interface Demo {
    void abc();

    default void show() {
        System.out.println("in default show method");

    }
}

class DemoImp implements Demo {

    public void abc() {
        System.out.println("implementing method for abstract method abc in the interface");

    }

    public void show() {
        System.out.println("in override show method");
    }
}

public class FunctionalInterface {

    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();

    }
}
