package DayTwo;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to check if its even or odd: ");
        int a = sc.nextInt();
        sc.close();
        if(a%2 == 0){
            System.out.println(a+" is an even number");
        }
        else{
            System.out.println(a+" is an odd number");
        }
    }
}
