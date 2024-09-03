import java.util.Scanner;
public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the time (in years): ");
        double time = sc.nextDouble();
        System.out.print("Enter the age of the customer: ");
        int age = sc.nextInt();
        double rate;
        if (age >= 65){
            rate = 12; 
        } else {
            rate = 10; 
        }
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The simple interest is: " + simpleInterest);
        sc.close();
    }
}

