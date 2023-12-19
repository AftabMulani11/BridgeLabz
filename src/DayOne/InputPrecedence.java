package DayOne;

import java.util.Scanner;

public class InputPrecedence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, res_1, res_2, res_3, res_4;
        System.out.println("welcome to BridgeLabz");
        System.out.print("Enter the value of a:");
        a = sc.nextInt();
        System.out.print("Enter the value of b:");
        b = sc.nextInt();
        System.out.print("Enter the value of c:");
        c = sc.nextInt();
        res_1 = a + b * c;
        res_2 = a * b + c;
        res_3 = c + a / b;
        res_4 = a % b + c;
        System.out.println(res_1);
        System.out.println(res_2);
        System.out.println(res_3);
        System.out.println(res_4);
    }
}
