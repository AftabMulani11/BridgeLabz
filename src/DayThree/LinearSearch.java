package DayThree;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int key;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key: ");
        key =sc.nextInt();
        for (int j : arr) {
            if (key == j) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Key found");
        }
        else{
            System.out.println("key not found");
        }
    }
}
