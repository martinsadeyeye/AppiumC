import java.util.ArrayList;
import java.util.List;

public class CapCase {

    public String toCapCase(String phrase) {
        List<String> sendWord = new ArrayList<>();

        // TODO put your code below this comment
        if (phrase == null) {
            return null;
        } else if (phrase.trim().isEmpty()) {
            return null;
        } else {
            String result = "";
            char firstChar = phrase.charAt(0);
            char firstCharToUpperCase = Character.toUpperCase(firstChar);
            result = result + firstCharToUpperCase;
            for (int i = 1; i < phrase.length(); i++) {
                char currentChar = phrase.charAt(i);
                char previousChar = phrase.charAt(i - 1);
                if (previousChar == ' ') {
                    char currentCharToUpperCase = Character.toUpperCase(currentChar);
                    result = result + currentCharToUpperCase;
                } else {
                    char currentCharToLowerCase = Character.toLowerCase(currentChar);
                    result = result + currentCharToLowerCase;
                }
            }
            return result;
        }

    }

    public static void main(String[] args) {
        CapCase capCase = new CapCase();
        String a = "most trees are blue";
        System.out.println(capCase.toCapCase(a));
    }
}