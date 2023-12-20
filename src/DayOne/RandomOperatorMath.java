package DayOne;

import java.util.Random;

public class RandomOperatorMath {
    public static void main(String[] args) {
        double a, b;
        char c;
        a = Math.floor(Math.random()*10)%10+1;
        b = Math.floor(Math.random()*10)%10+1;
        char[] operators = {'+', '-', '*', '/'};
        Random random = new Random();
        c = operators[random.nextInt(operators.length)];
        switch (c) {
            case '+':
                System.out.println("Random arithmetic operation is " + c);
                System.out.println("Random numbers are "+a+" and "+b);
                System.out.println("Random arithmetic operation of two random number is " + (a + b));
                break;
            case '-':
                System.out.println("Random arithmetic operation is " + c);
                System.out.println("Random numbers are "+a+" and "+b);
                System.out.println("Random arithmetic operation of two random number is " + (a - b));
                break;
            case '*':
                System.out.println("Random arithmetic operation is " + c);
                System.out.println("Random numbers are "+a+" and "+b);
                System.out.println("Random arithmetic operation of two random number is " + (a * b));
                break;
            case '/':
                System.out.println("Random arithmetic operation is " + c);
                System.out.println("Random numbers are "+a+" and "+b);
                System.out.println("Random arithmetic operation of two random number is " + (a / b));
                break;
            default:
                System.out.println("Nothing to do");
        }
        //System.out.println("Random arithmetic operation of two random number is " + );
    }
}
