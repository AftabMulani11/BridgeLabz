package DayOne;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double delta, x1, x2, a, b, c;
        System.out.print("Enter the value of a: ");
        a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        c = sc.nextDouble();
        delta = b * b - 4 * a * c;
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("Root 1 of x is "+x1);
        System.out.println("Root 2 of x is "+x2);
    }
}
