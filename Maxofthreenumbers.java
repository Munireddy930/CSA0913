import java.util.Scanner;
public class Maxofthreenumbers {
    public static void main(String[]args){
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enterthe first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second numbre:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();

        int max;

        if(num1>=num2 && num1>= num3){
            max = num1;
        }else if
        (num2>= num1 && num2>=num3){
               max = num2;
        }else{
        max = num3;
    }
System.out.println("Max of three numbers"+ max);
    }
}