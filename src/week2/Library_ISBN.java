package week2;
import java.util.Scanner;
public class Library_ISBN {
    static String normalizeCode(String raw) {
        String code = raw.trim();
        if (code.length() < 3) {
            return code;
        }
        String publisher = code.substring(0, 3).toUpperCase();
        return publisher + code.substring(3);
    }
    static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid Code: Wrong length";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid Code: Non-letter publisher code";
            }
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid Code: Non-digit body";
            }
        }
        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);
        StringBuilder result = new StringBuilder();
        result.append("[").append(publisher).append("] YEAR: ").append(year).append(" | CATALOG: ").append(catalog);
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN code: ");
        String raw = sc.nextLine();
        String normalized = normalizeCode(raw);
        String result = validateAndFormat(normalized);
        System.out.println(result);
        sc.close();
    }
}
