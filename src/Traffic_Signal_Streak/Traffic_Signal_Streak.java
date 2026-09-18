package Traffic_Signal_Streak;
import java.util.Scanner;
public class Traffic_Signal_Streak {
    static void findLongestStreak(String signalLog) {
        int currentStreak = 1;
        int longestStreak = 1;
        char longestColor = signalLog.charAt(0);
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestColor = signalLog.charAt(i);
            }
        }
        System.out.println("Longest Streak: '" + longestColor + "' repeated " + longestStreak + " times");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine();
        if (signalLog.isEmpty()) {
            System.out.println("Signal log cannot be empty.");
        } else {
            findLongestStreak(signalLog);
        }
        sc.close();
    }
}