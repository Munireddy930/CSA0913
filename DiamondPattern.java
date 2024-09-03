import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enetr the number of rows:");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            printRow(rows, i);
        }
        for (int i = rows - 1; i >= 1; i--) {
            printRow(rows, i);
        }
    }
    static void printRow(int rows, int i) {
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
