package DayFour;

import java.util.Scanner;

public class LengthofArray {
    static Scanner sc = new Scanner(System.in);
    static String name;
    public static void main(String[] args) {
        String resName = UserInput();
        int res = CheckLength(resName);
        display(res);
    }
    private static String UserInput(){
        System.out.print("Enter the name: ");
        name = sc.next();
        return name;
    }
    private static int CheckLength(String name){
        int len = 0;
        for (char c : name.toCharArray()){
            len++;
        }
        return len;
    }
    private static void display(int res){
        System.out.println("Length of string is: "+res);
    }
}
