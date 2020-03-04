class PalindromeExample2 {
    public static Integer palindromeChainLength( Integer num ) {
        String input = String.valueOf(num);
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }
        int reversedInt = Integer.parseInt(result);

        return addition(reversedInt, num);
    }

    public static boolean isPalindrome(int number) {
        return (number == palindromeChainLength(number));
    }


    public static int addition(int reversedInt, int input )
    {
        return reversedInt + input;

    }

        public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Reversed: " + palindromeChainLength(number));

        if (number == palindromeChainLength(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}