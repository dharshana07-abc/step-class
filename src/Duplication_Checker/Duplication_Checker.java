package Duplication_Checker;
import java.util.Scanner;
public class Duplication_Checker {
        static void checkDuplicateSeats(int[] seatNumbers) {
            boolean found = false;
            for (int i = 0; i < seatNumbers.length; i++) {

                boolean alreadyChecked = false;
                for (int k = 0; k < i; k++) {
                    if (seatNumbers[i] == seatNumbers[k]) {
                        alreadyChecked = true;
                        break;
                    }
                }
                if (alreadyChecked) {
                    continue;
                }
                for (int j = i + 1; j < seatNumbers.length; j++) {

                    if (seatNumbers[i] == seatNumbers[j]) {
                        System.out.println(
                                "Duplicate Seat Number Found: "
                                        + seatNumbers[i]
                        );
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("No Duplicate Seats Found");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            int[] seatNumbers = new int[n];
            System.out.println("Enter seat numbers:");
            for (int i = 0; i < n; i++) {
                seatNumbers[i] = sc.nextInt();
            }
            checkDuplicateSeats(seatNumbers);
            sc.close();
    }
}
