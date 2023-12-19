package DayOne;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int inputSeconds = sc.nextInt();
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int remainingSeconds = inputSeconds % 60;
        System.out.printf("%d seconds is equal to:\n", inputSeconds);
        System.out.printf("%d hours, %d minutes, and %d seconds.\n", hours, minutes, remainingSeconds);
    }
}
