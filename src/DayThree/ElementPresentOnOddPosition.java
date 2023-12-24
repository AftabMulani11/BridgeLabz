package DayThree;

public class ElementPresentOnOddPosition {
    public static void main(String[] args) {
        int[] arr = {11, 54, 87, 63, 54, 7, 11, 25, 89};
        System.out.println("Accourding to index value");
        for(int i =1;i<arr.length;i++){
            if(i%2==0){
                continue;
            }
            else{
                System.out.println(i+" Element in array is "+arr[i]);
            }

        }
    }
}
