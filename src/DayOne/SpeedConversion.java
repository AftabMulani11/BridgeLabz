package DayOne;

import java.util.Scanner;

public class SpeedConversion {
    public static void main(String[] args) {
        int km, m, ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the choice correctly: \n1. For km/h to m/s \n2. For m/s to km/h \nEnter your choice: ");
        ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.print("Enter the speed in km/h: ");
                km = sc.nextInt();
                m = (km*1000)/3600;
                System.out.printf("the speed of %dkm/h in m/s is %dm/s", km, m);
                break;
            case 2:
                System.out.print("Enter the speed in m/s: ");
                m = sc.nextInt();
                km = (m*3600)/1000;
                System.out.printf("the speed of %dm/s in m/s is %dkm/h", m, km);
                break;
            default:
                System.out.println("Invalid choice closing the conversion chart");
                break;
        }
    }
}
