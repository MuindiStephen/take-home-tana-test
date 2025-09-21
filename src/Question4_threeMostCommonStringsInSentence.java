import java.util.*;

public class Question4_threeMostCommonStringsInSentence {

    public static List<String> findThreeMostCommonStringsInSentence(String sentence) {
        // Give the sentence
        // "hi there care to discuss algorithm basis or how to solve algorithm or"
        // I used split to divide the sentence into strings and used regression for putting a space between the strings
        String[] words = sentence.trim().split("\\s+");

        // Count the number of occurrences of a string
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Used a priority queue for priorities in finding commonness in strings
        PriorityQueue<HashMap.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (!a.getValue().equals(b.getValue())) {
                        return b.getValue() - a.getValue();
                    } else {
                        return a.getKey().compareTo(b.getKey());
                    }
                }
        );

        pq.addAll(freqMap.entrySet());

        // Fins the top three most appearing strings
        List<String> topWords = new ArrayList<>();
        int count = 0;
        while (!pq.isEmpty() && count < 3) {
            topWords.add(pq.poll().getKey());
            count++;
        }

        // And finally sort them alphabetically
        Collections.sort(topWords);
        return topWords;
    }

    public static void main(String[] args) {
        String sentence = "hi there care to discuss algorithm basis or how to solve algorithm or";
        List<String> result = findThreeMostCommonStringsInSentence(sentence);
        System.out.println(resul -t);
    }
}
