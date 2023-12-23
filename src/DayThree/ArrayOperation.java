package DayThree;

import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[ ] a = new int[5];
        System.out.println("Enter the Elements of array: ");
        for (int i=0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for (int i=0; i<a.length;i++){
            System.out.println((i+1)+" Element of array is "+a[i]);
        }
    }
}
