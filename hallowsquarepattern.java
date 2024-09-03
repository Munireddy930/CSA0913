import java.util.Scanner;
public class hallowsquarepattern{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows(and columns)in the sqaure");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
            
            
            if(i==1||i==rows||j==1||j==rows){
                  System.out.print("* ");
            }else{
            System.out.print("  ");
            }
        }
        System.out.println();
    }
    sc.close();
    
    }
}