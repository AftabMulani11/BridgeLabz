package DayOne;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Weight in pounds: ");
        double poundWeight = sc.nextDouble();
        double gramWeight = poundWeight * 453.592;
        double kgWeight = gramWeight / 1000;
        System.out.println("Weight of " + poundWeight + " Pounds in Kg is " + kgWeight + ".");
    }
}
