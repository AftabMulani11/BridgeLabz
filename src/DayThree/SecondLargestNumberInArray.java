package DayThree;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 5, 6, 9, 10};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Second largest number in this array is "+arr[arr.length-2]);
    }
}
