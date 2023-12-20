package DayTwo;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to check whether it is a leap year: ");
        a = sc.nextInt();
        if (a>=1582){
            if (a % 4 == 0 && a%100 != 0) {
                System.out.println("This is a leap year");
                }
            else if (a % 4 == 0 && a % 400 == 0) {
                System.out.println("it is a lear year");
            }
            else{
                System.out.println("This is not a leap year" );
            }
            }
        else{
            System.out.println("Leap year cannot be said for below 1582");
        }
    }
}
