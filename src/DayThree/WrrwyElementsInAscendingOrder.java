package DayThree;

public class WrrwyElementsInAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {15, 15, 45, 75, 1, 85, 45, 75};
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
        System.out.println("sorted array elements are");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
