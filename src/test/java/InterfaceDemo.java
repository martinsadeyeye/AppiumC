interface Abc {
    void show();
}

class Implementor implements Abc {
    public void show() {
        System.out.println("Implementing the method for void show interfaces");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Abc obj = new Implementor();
        obj.show();


        Abc obj1 = () -> System.out.println("Lamda Expression Implementing the method for void show interfaces");
        obj1.show();
    }
}
