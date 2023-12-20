package DayTwo;

public class ArrayDivisibleByThree {
    public static void main(String[] args) {
        int[] a =new int[10];
        int c = 0;
        for (int i = 1; i<=30; i++) {
            if (i % 3 == 0) {
                a[c] = i;
                c++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
