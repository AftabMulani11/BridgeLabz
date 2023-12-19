package DayOne;

import java.util.Scanner;

public class ComputeMarks {
    public static void main(String[] args) {
        String stuName;
        double phyMarks, cheMarks, mathMarks, totalMarks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Student: ");
        stuName = sc.nextLine();
        System.out.print("Enter the Physics marks of " + stuName + "(out of 100): ");
        phyMarks = sc.nextDouble();
        System.out.print("Enter the Maths marks of " + stuName + "(out of 100): ");
        mathMarks = sc.nextDouble();
        System.out.print("Enter the Chemistry marks of " + stuName + "(out of 100): ");
        cheMarks = sc.nextDouble();
        totalMarks = ((phyMarks + mathMarks + cheMarks) / 300) * 100;
        System.out.println(stuName + " obtained following % of marks in PCM: \nPhysics: " + phyMarks + "%\nChemistry: " + cheMarks + "%\nMaths: " + mathMarks +
                "%\ntotal: " + totalMarks + "%");
    }
}
