package DayThree;

public class ElementPresentOnEvenPosition {
    public static void main(String[] args) {
        int[] arr = {11, 54, 87, 63, 54, 7, 11, 25, 89};
        for(int i =0;i<arr.length;i++){
            if(i%2!=0){
                continue;
            }
            else{
                System.out.println(i+" Element in array is "+arr[i]);
            }

        }
    }
}
