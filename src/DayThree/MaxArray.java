package DayThree;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = new int[] {25, 11, 45, 85, 95, 65};
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Largest element in the array is "+max);
    }
}
