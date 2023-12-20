package DayTwo;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a;
        int att = 0;
        do {
            System.out.print("enter the size of an array between 1 to 10: ");
            a =sc.nextInt();
            att++;
            if (a >= 1 && a <= 10) {
                break;
            } else if (att == 3) {
                System.out.println("Array size entered is not correct. Exiting program.");
                System.exit(0);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        } while(true);

        double[] s = new double[a];
        for (int i =0; i<a;i++){
            s[i] = 100.0 + (random.nextDouble() * 400.0);
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            if (i < s.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
