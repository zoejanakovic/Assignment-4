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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask for user input
        Scanner input = new Scanner(System.in);
        //ask user to input measure in inches
        System.out.println("Please enter the measure in inches that you wish to convert.");
        //scan name into a variable
        double inches = input.nextDouble();
        //convert to cm
        double cm = 2.54*inches;
        
        System.out.println(inches + " inches is the same as " + cm + " cm");
        
        
        
    }
}
