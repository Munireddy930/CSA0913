public class StringReverse{
    public static void main(String[] args) {
        String input = "Muni";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}
