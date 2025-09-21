import java.util.List;

public class Question4_threeMostCommonStringsInSentenceTest {

    public static void main(String[] args) {
        String sentence = "hi there care to discuss algorithm basis or how to solve algorithm or";

        // in above sentence
        // algorithm => occurs - 2 times
        // to => occurs - 2 times
        //or => occurs 2 times

        List<String> output = Question4_threeMostCommonStringsInSentence.findThreeMostCommonStringsInSentence(sentence);

        System.out.println("We expect the output to be: [algorithm, or, to]");
        System.out.println("3 Most Common strings in alphabetical order: "+output);
    }
}
