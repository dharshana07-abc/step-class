package week2;
import java.util.*;
public class Word_Frequency_Analyzer {
    static void printFilteredWordFrequency(String feedback) {
        feedback = feedback.toLowerCase().replace(".", "").replace(",", "").replace("!", "").replace("?", "");
        String[] words = feedback.trim().split("\\s+");
        HashSet<String> stopWords = new HashSet<>(
                Arrays.asList("the", "was", "and", "a",
                        "is", "of", "in")
        );
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty() || stopWords.contains(word)) {
                continue;
            }
            frequency.put(word,
                    frequency.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedWords =
                new ArrayList<>(frequency.entrySet());
        sortedWords.sort((a, b) ->
                Integer.compare(b.getValue(), a.getValue()));
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + ": "
                    + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feedback:");
        String feedback = sc.nextLine();
        printFilteredWordFrequency(feedback);
        sc.close();
    }
}
