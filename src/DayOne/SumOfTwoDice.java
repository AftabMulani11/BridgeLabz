package DayOne;

public class SumOfTwoDice {
    public static void main(String[] args) {
        double a, b, c;
        a = Math.floor(Math.random()*10)%6+1;
        b = Math.floor(Math.random()*10)%6+1;
        c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
