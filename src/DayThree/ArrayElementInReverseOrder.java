package DayThree;

public class ArrayElementInReverseOrder {
    public static void main(String[] args) {
        int[] arr = new int[]{ 2, 3, 65, 78, 654, 1, 786};
        System.out.println("elements in reverse order are ");
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
