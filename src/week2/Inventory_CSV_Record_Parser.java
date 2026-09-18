package week2;
import java.util.Scanner;
public class Inventory_CSV_Record_Parser {
    static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",", -1);
        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + fields[0].trim()
                    + " | SKU: " + fields[1].trim()
                    + " | Qty: " + fields[2].trim());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inventory record: ");
        String csvLine = sc.nextLine();
        parseInventoryRecord(csvLine);
        sc.close();
    }
}
