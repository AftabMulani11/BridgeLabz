package DayTwo;

import java.util.Scanner;
public class GuessingTheNumberWithLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int)(Math.floor(Math.random()*101));
        int a, flag = 0;
        System.out.println(n);
        System.out.println("Enter the number to guess(You have 5 chances to guess)");
        while(true){
            if (flag == 5){
                System.out.println("Five chances are over You lost the game i win.");
                break;
            }
            else{
                a = sc.nextInt();
                if(a<n){
                    System.out.println("Too Low");
                    flag++;
                }
                else if(a>n){
                    System.out.println("Too High");
                    flag++;
                }
                else {
                    System.out.println("You have guess the number You won the game.");
                    break;
                }
            }
        }
    }
}
