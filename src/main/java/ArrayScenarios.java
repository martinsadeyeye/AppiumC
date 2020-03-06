public class ArrayScenarios {


    public static void main(String[] args) {

        int sum = 0;
        int c[] = {1, 2, 3, 4, 5,6,7,8};
        for (int i = 0; i < c.length; i++) {
            //sum = sum + c[i];

            if ( c[i] == 7 ) {
                System.out.println(i);

                break;
            }
        }
       // System.out.println(sum);
    }
}