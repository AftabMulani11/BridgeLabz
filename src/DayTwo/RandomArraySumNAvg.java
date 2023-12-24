package DayTwo;
public class RandomArraySumNAvg {
    public static void main(String[] args) {
        int[] arr = new int[75];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.floor(Math.random() * 101));
        }
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Elements of the array are as follows:");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println("\nSum of all integers in the array is " + sum);
        double average = (double) sum / arr.length;
        System.out.println("Average of the integers in the array is " + average);
    }
}