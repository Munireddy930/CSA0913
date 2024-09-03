public class Sum{
    public static void main(String[]args){
        int [] numbers = {1,2,3,4,5};
        int sum = CalculateSum(numbers);
        System.out.println("The sum of array elements is:" + sum);
    }
    public static int CalculateSum(int[] array){
        int sum = 0;
        for(int number : array){
            sum += number;
        }

    return sum;
}
}