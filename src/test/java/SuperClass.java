
class A {

    public A() {
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("in A int");
    }

}

class B extends A {

    public B() {
        super(); // this call the default constructor of the super class
        //// specifying the parameter here will allow u call the parameterized constructor of the super class and default constructor here
    }

    public B(int i) {
        super(i);// specifying the paramater here will allow u call the parameterized constructor of the super class
        System.out.println("in B int");
    }
}

public class SuperClass {

    public static void main(String[] args) {

        //creating the object of a subclass, it also call the superclass ( also default constructor of the super class in case you specify Parameter)
        B obj = new B();
        //System.out.print(obj);
    }
}
