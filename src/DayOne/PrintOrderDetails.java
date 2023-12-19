package DayOne;

import java.util.Scanner;

public class PrintOrderDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int OrderID, Quantity, totalCost;
        System.out.print("Enter the Order ID: ");
        OrderID = sc.nextInt();
        System.out.print("Enter the Item Name: ");
        String itemName = sc.next();
        System.out.print("Enter the Quantity in the order: ");
        Quantity = sc.nextInt();
        System.out.print("Enter the Total Cost form the Order: ");
        totalCost = sc.nextInt();
        System.out.println(OrderID + ": " + Quantity + " Quantity of " + itemName + " for a total of Rs." + totalCost);
    }
}
