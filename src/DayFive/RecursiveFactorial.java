package DayFive;

public class RecursiveFactorial {
    private static int fact(int a) {
        if(a>=1){
            return a * fact(a-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int res = fact(n);
        System.out.println("ractorial of "+n+" is "+res);
    }

}
