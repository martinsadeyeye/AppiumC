public class ArrayMinMaxNumber {

    //   2 4 5
    //  3 0 7
    // 1 2 9
    public static void main(String[] args) {


        int abc[][] = {{2, 4, 5}, {3, 2, 10}, {1, 2, 0}};
        int min = abc[0][0];
        int minColumn = 0;

        for (int i = 0; i < 3; i++)// Outer row
        {
            for (int j = 0; j < 3; j++)// column
            {
                if ( abc[i][j] < min ) {

                    min = abc[i][j]; // find the minimum number in a array
                    minColumn = j;// identify the column of minimum number
                }
            }
        }
        System.out.println("Minimum Number: " + min);
        int max = abc[0][minColumn];
        int k = 0;
        while (k < 3) {
            if ( abc[k][minColumn] > max ) {
                max = abc[k][minColumn];
            }
            k++;
        }
        System.out.println("Maximum Number in the Column that has min Number: " + max);
    }
}
