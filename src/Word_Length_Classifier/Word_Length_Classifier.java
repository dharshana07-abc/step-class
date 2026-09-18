package Word_Length_Classifier;
import java.util.Scanner;
public class Word_Length_Classifier {
    public class Word_Length_Classifier {
        static void classifyWordLengths(String review) {
            int shortCount = 0;
            int mediumCount = 0;
            int longCount = 0;
            String[] words = review.trim().split("\\s+");
            for (int i = 0; i < words.length; i++) {
                int length = words[i].length();
                if (length >= 1 && length <= 4) {
                    shortCount++;
                }
                else if (length >= 5 && length <= 8) {
                    mediumCount++;
                }
                else if (length >= 9) {
                    longCount++;
                }
            }
            System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter movie review:");
            String review = sc.nextLine();
            if (review.trim().isEmpty()) {
                System.out.println("Review cannot be empty.");
            }
            else {
                classifyWordLengths(review);
            }
            sc.close();
        }
    }
}
