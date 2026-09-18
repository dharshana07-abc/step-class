package Warehouse_Inventory_Analyzer;
import java.util.Scanner;
public class Warehouse_Inventory_Analyzer {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        int highest = sectionA[0];
        String section = "A";
        int item = 1;
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "A";
                item = i + 1;
            }
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "B";
                item = i + 1;
            }
        }
        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        if (totalA == totalB) {
            System.out.println("Status: Balanced");
        } else {
            System.out.println("Status: Not Balanced");
        }
        System.out.println("Highest Quantity: " + highest
                + " (Section " + section
                + ", Item " + item + ")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Number of items must be positive.");
            sc.close();
            return;
        }
        int[] sectionA = new int[n];
        int[] sectionB = new int[n];
        System.out.println("Enter Section A quantities:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }
        System.out.println("Enter Section B quantities:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }
        analyzeInventory(sectionA, sectionB);
        sc.close();
    }
}
