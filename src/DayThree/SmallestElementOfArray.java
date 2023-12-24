package DayThree;

public class SmallestElementOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{ 2, 3, 65, 78, 654, 1, 786};
        int max = 0;
        for (int k : arr) {
            if (max < k) {
                max = k;
            }
        }
        for (int i : arr) {
            if (max > i) {
                max = i;
            }
        }
        System.out.println("smallest element in array is "+max);
    }
}
