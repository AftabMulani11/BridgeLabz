package DayTwo;

import java.util.Scanner;
public class GuessingTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int)(Math.floor(Math.random()*101));
        int a;
        System.out.println(n);
        System.out.println("Enter the number to guess");
        while(true){
            a = sc.nextInt();
            if(a<n){
                System.out.println("Too Low");
            }
            else if(a>n){
                System.out.println("Too High");
            }
            else {
                System.out.println("You have guess the number");
                break;
            }
        }
    }
}
