package DayTwo;

public class SquaresofNumbers {
    public static void main(String[] args) {
        int[] s = new int[10];
        for(int i = 1; i<=10; i++){
            s[i - 1] = i * i;
        }
        System.out.print("Array elements are ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            if (i < s.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
