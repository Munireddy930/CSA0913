import java.util.Scanner;
public class Usernamevalid{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter valid username");
String validUsername = scanner.nextLine();

System.out.println("Enter your username");
String inputUsername = scanner.nextLine();

if(inputUsername.equals(validUsername)){
System.out.println("User name  is valid.");
}else{
System.out.println("User name is not valid.");
}
}
}