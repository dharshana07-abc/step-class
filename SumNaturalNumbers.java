import java.util.Scanner;
public class SumNaturalNumbers {
    static void sumOfNaturalNumbers(int n) {
        int count=1;
        int sum = 0;
        while (count<= n) {
            sum = sum+count;
            count++;
        }
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        sumOfNaturalNumbers(n);
    }
}

