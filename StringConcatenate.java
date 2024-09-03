public class StringConcatenate {
    public static void main(String[] args) {
        String s1 = "Muni";
        String s2 = "Reddy";
        String result1 = s1 + s2;
        System.out.println("Result 1: " + result1);
        String result2 = s1.concat(s2);
        System.out.println("Result 2: " + result2);
    }
}