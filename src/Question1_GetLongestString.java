import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1_GetLongestString {

    // A function to pass the array of strings and a list of valid characters
    // Use Character as a wrapper class for char primitive data type
    public static String getTheLongestString(List<Character> characters, String[] strings) {
        Set<Character> validChars = new HashSet<>(characters);

        // Declare a variable and let's initialize it with empty string as an initial value of the string and also represent default string as the longest
        String theLongestString = "";

        // A for loop that iterates in the array of strings for each string being passed to check if passes the conditions and then compare it with default string declared
        // to find the longest string in the Array
        for (String str : strings) {
            if (validateStrings(str, validChars)) {
                if (str.length() > theLongestString.length()) {
                    theLongestString = str;
                }
            }
        }
        return theLongestString;
    }

    /**
     * This method will validate string based on the conditions
     * 1. The string should have non-repetitive identical characters, for example 'AABCD' is not valid since it contains 'AA'.
     * 2. The string should only contain the characters among given list of valid characters. Function parameters: - characters - List of valid characters. - strings - Array of Strings
     * @param str
     * @param validChars
     * @return
     */
    private static boolean validateStrings(String str, Set<Character> validChars) {
        for (int i = 0; i < str.length(); i++) {
            //
            char c = str.charAt(i);

            // Check if string contains valid character to pass the condition - List of characters: "ABCD"
            if (!validChars.contains(c)) {
                return false;
            }

            // Check for non-repetitive identical characters that is repetitive characters 'AA'
            if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scenario:
        // List of characters: "ABCD"
        List<Character> validCharacters = Arrays.asList('A', 'B', 'C', 'D');

        // List of strings: "AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"
        String[] strings = { "AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA" };

        String result = getTheLongestString(validCharacters, strings);
        System.out.println("The Longest String is: " + result);
    }
}
