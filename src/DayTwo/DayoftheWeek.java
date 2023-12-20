package DayTwo;

import java.util.Scanner;

public class DayoftheWeek {
    public static void main(String[] args) {
        String []a = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value between 1 to 7 to check the day: ");
        i = sc.nextInt();
        if (i<=7){
            System.out.print("This is "+a[i-1]);
        }
        else{
            System.out.print("Wrong value please try again");
        }
        sc.close();
    }
}
