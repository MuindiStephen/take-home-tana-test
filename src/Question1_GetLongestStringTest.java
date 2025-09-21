import java.util.*;

/**
 * Question 1 test
 * @author MuindiStephen
 * @email stephenmuindi241@gmail.com
 */
public class Question1_GetLongestStringTest {

    public static void main(String[] args) {
        // Valid characters: A, B, C, D
        // Array of string string
        List<Character> validCharacters = Arrays.asList('A','B','C','D');
        String[] stringArray = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"};

        // AABCDA - is not valid because of repetitiveness
        // ABCDZADC" contains illegal character 'Z'

        String result = Question1_GetLongestString.getTheLongestString(validCharacters, stringArray);
        System.out.println("The Expected longest string: ABCDABDCA");
        System.out.println("Longest string:   " + result);
    }
}

