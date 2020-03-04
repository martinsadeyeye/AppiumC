class C{
    public void show() {
        System.out.println("in C");
    }
}

class D extends C
{
    public void show() {
        super.show(); // this call the super call method also from the child class method
        System.out.println("in D");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        D obj1 = new D();
        obj1.show();
    }
}
