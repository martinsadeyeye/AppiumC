public class ArrayDemo {

    public static void main(String[] args) {

        int d[][] = {

                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {2, 3, 4, 6}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }

        for(int k[]: d)
        {
            for(int l : k)
            {
                System.out.print(" " +l);

            }
            System.out.println();

        }

    }
}
