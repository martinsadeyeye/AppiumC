class Student {

    //making the class variable private and method that will access the variable should be public
    //  that means you are binding ur data with  method - this is called Encapsulation
    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int r) {
        this.rollno = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Student s1 = new Student();
        // s1.rollno = 10;
        s1.setRollno(2);
        //  s1.name = "Martins";
        s1.setName("Martins");

        System.out.println(s1.getRollno());
        System.out.println(s1.getName());

    }
}
