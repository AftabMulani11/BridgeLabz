package DayOne;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double distance;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1: ");
        x1 = sc.nextInt();
        System.out.print("Enter the value of x2: ");
        x2 = sc.nextInt();
        System.out.print("Enter the value of y1: ");
        y1 = sc.nextInt();
        System.out.print("Enter the value of y2: ");
        y2 = sc.nextInt();
        distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("result of the Distance is "+distance);
    }
}
