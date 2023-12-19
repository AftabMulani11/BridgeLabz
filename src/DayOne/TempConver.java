package DayOne;

import java.util.Scanner;

public class TempConver {

    static double CelsiustoFahrenheit(double temp)
    {
        return ((temp * 9)/5) + 32;
    }

    static double FahrenheittoCelsius(double temp)
    {
        return (temp - 32)* 5/9;
    }

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to BridgeLabz");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the correct option for conversion \n 1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit \n Enter Your Choice: ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.print("Enter the Fahrenheit temperature: ");
                double f = sc.nextDouble();
                System.out.println("Temperature in Celsius is: "+FahrenheittoCelsius(f));
                break;
            case 2:
                System.out.print("Enter the Celsius temperature: ");
                double c = sc.nextDouble();
                System.out.println("Temperature in Fahrenheit is: "+CelsiustoFahrenheit(c));
                break;
            default:
                System.out.println("Enter the correct choice");

        }
        sc.close();
    }
}
