public class ReverseDemo {

    public static void main(String[] args) {

        String sName = "madam";
        String t = "";

        for (int i = sName.length() - 1; i >= 0; i--) {

            //System.out.println(sName.charAt(i));
            t = t+ sName.charAt(i); // using + operator to concatinate 2 diff string

        }
        System.out.println(t);

        if(sName==t)
        {
            System.out.println("its is pali");
        }
    }
}
