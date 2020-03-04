class Challenge {
    public static Integer palindromeChainLength(Integer num) {
        Integer count = 0;
        long originalInteger = num;

        if ( isPalindrome(originalInteger) ) {
            return count;
        } else {
            while (!isPalindrome(originalInteger)) {
                count++;
                originalInteger = originalInteger + reversedNumber(originalInteger);
            }
            return count;
        }
    }

    public static long reversedNumber(long outcomeNumForReverse) {
        long reversedNumber = 0;
        while (outcomeNumForReverse != 0) {
            long remainder = outcomeNumForReverse % 10; //getting remainder
            reversedNumber = reversedNumber * 10 + remainder;
            outcomeNumForReverse = outcomeNumForReverse / 10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(long number) {
        long reversedNumber = reversedNumber(number);

        if ( number == reversedNumber )

            return true;
        else
            return false;
    }
}