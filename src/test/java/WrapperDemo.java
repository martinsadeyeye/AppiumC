


public class WrapperDemo {

    public static void main(String[] args) {

        int i = 5; // primitive data type  // OOPs say everything should be done it terms of object
        // instead of using int, use Integer
        Integer ii = new Integer(5); // wrapper class

        Integer iii = new Integer(i); // Boxing - wrapping

        int j = iii.intValue(); // UnBoxing - wrapping

        Integer value = i;  // AutoBoxing

        int k = value; // AutoUnboxing

        // method in Integer classs
        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);
    }
}
