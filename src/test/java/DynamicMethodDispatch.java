class E {
    public void show() {
        System.out.println("in E");
    }
}

class F extends E {
    public void show() {
        System.out.println("in F");
    }
}

class G extends E {
    public void show() {
        System.out.println("in G");
    }
}


public class DynamicMethodDispatch {

    public static void main(String[] args) {

   // F obj1 = new E(); // runtime polymorphison
   // obj1.show();

   // obj1 = new G(); // Dynamic method dispatch
  //  obj1.show();

    }
}



