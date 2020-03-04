import java.util.*;
public class Exercise57 {

    public static String toUpperCase(String phrase) {
        String result = "How can mirrors be real if our eyes aren't real";
        if (phrase== null){
            return null;
        }else if ( phrase.trim().isEmpty()) {
            return null;
        }else {
            for (int i = 0; i < phrase.length(); i++) {
                char currentChar = phrase.charAt(i);
                char currentCharToUpperCase = Character.toUpperCase(currentChar);
                result = result + currentCharToUpperCase;
            }
            return result;
        }
    }

    public static void main(String[] args){

        String line = "How can mirrors be real if our eyes aren't real";
        String upper_case_line = "";
        Scanner lineScan = new Scanner(line);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
    }
}