import java.util.Scanner;
public class factorial{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number:");
        long factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
            System.out.println("factorial"+factorial);
        
    }
}