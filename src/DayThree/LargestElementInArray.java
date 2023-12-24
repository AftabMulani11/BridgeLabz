package DayThree;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 65, 78, 654, 786};
        int max = 0;
        for(int j = 0;j<arr.length;j++){
            if(max<arr[j]){
                max = arr[j];
            }
        }
        System.out.println("Largest element in array is "+max);
    }
}
