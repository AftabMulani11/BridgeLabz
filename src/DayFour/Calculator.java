package DayFour;

public class Calculator {
    int n1 = 10, n2 = 5;
    static int a = 10, b = 30;
    public static void main(String[] args) {
        addition();
        subtraction(a,b);
        int res = multiplication(a,b);
        System.out.println("result is "+res);
        Calculator obj = new Calculator();
        int data =obj.division();
        System.out.println(data);
    }
    private int division () {

        return n1 / n2;
    }
    private static int multiplication (int p, int q) {
        return p * q;
    }
    private static void subtraction(int x, int y){
        int z = x-y;
        System.out.println("Substraction is "+z);
    }
    private static void addition(){
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println("addtion of "+a+" and "+b+" is "+c);
    }
}
