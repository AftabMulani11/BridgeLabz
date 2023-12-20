package DayTwo;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Score of student: ");
        int s = sc.nextInt();
        if(s <= 59){
            System.out.print("Student get the F");
        }
        else if(s <= 69){
            System.out.print("Student get the D");
        }
        else if(s <= 79){
            System.out.print("Student get the C");
        }
        else if(s <= 89){
            System.out.print("Student get the B");
        }
        else if(s <= 100){
            System.out.print("Student get the A");
        }
    }
}
