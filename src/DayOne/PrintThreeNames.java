package DayOne;

import java.util.Scanner;

public class PrintThreeNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BridgeLabz");
        String name_1, name_2, name_3;
        System.out.print("Enter the name 1: ");
        name_1 = sc.next();
        System.out.print("Enter the name 2: ");
        name_2 = sc.next();
        System.out.print("Enter the name 3: ");
        name_3 = sc.next();
        System.out.println("Hi!, my friends are : "+ name_3 + ", " + name_2 + " and " +name_1 + ".");
    }
}
