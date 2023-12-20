package DayTwo;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to generate the Table: ");
        int a = sc.nextInt();
        sc.close();
        for(int i = 1;i<=10;i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}