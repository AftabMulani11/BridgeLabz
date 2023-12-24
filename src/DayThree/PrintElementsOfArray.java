package DayThree;

public class PrintElementsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 7, 9};
        System.out.println("Elements of array are as follows ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
