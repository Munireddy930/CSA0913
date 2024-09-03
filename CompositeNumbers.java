import java.util.Scanner;
public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.println("Composite numbers between " + a + " and " + b + ":");
        for (int num = a; num <= b; num++) {
            if (num > 1 && isComposite(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
    public static boolean isComposite(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
