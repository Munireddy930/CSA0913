import java.util.Scanner;
public class hallowpyrmid{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number of rows");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=2 * i - 1;k++){
                if(k==1||k== 2 * i - 1||i==rows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}