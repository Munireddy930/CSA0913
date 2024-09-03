import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int votingAge = 18;

        if (age >= votingAge) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = votingAge - age;
            System.out.println("You are not eligible to vote.");
            System.out.println("You need to wait " + yearsLeft + " more years to be eligible.");
        }

        scanner.close();
    }
}
