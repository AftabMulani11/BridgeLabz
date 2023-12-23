package DayFive;

public class RecursiveFunction {
    static int count = 0;
    public static void fun(){
        count++;
        if(count<=5){
            System.out.println("Hello");
            fun();
        }
    }
    public static void main(String[] args) {
        fun();
    }
}
