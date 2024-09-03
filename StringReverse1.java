public class StringReverse1 {
    public static void main(String[] args) {
        String input = "Muni Reddy";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}
