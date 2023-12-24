package DayTwo;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nter the Text to Reverse: ");
        String name = sc.next();
        StringBuilder  s = new StringBuilder(name);
        System.out.println(s.reverse());
    }
}
