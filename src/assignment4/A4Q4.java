/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author janaz9178
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner for user input
        Scanner input = new Scanner(System.in);

        //ask user to input cost of food and scan into a variable
        System.out.println("How much does the food for prom cost?");
        double food = input.nextDouble();

        //ask cost of dj and scan into a variable
        System.out.println("How much does the DJ cost?");
        double dj = input.nextDouble();

        //ask cost of hall and scan into a variable
        System.out.println("How much does it cost to rent the hall?");
        double hall = input.nextDouble();

        //ask cost of decorations and scan into a variable
        System.out.println("How much do the decorations cost?");
        double decor = input.nextDouble();

        //ask cost of staff and scan into a variable
        System.out.println("How much does it cost for staff?");
        double staff = input.nextDouble();

        //ask cost of other things and scan into a variable
        System.out.println("How much for miscellaneous costs?");
        double other = input.nextDouble();

        //determine total cost and how many tickets must be sold
        double cost = food + dj + hall + decor + staff + other;
        double tickets = cost / 35;
        Math.ceil(tickets);
        System.out.println("The total cost is $" + cost + ". Your will need to sell " + tickets + " tickets to break even.");

    }
}
