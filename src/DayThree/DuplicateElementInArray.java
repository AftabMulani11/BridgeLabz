package DayThree;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {15, 15, 45, 75, 1, 85, 45, 75};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }
}
