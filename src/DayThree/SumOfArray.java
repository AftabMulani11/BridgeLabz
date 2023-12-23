package DayThree;

public class SumOfArray {
    public static void main(String[] args) {
        int[] rr = new int[] {1,2,3,4,5};
        int sum = 0;
        for (int j : rr) {
            sum = sum + j;
        }
        System.out.println("Sum of all the elements of and array is "+sum);
    }
}
