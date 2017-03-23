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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner to get user input
        Scanner input = new Scanner(System.in);

        //ask user to input 4 numbers
        System.out.println("Please enter in four numbers on seperate lines.");

        //scan numbers into variables
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double fourth = input.nextDouble();

        //output the numbers on one line
        System.out.println("Your numbers were " + first + ", " + second + ", " + third + ", and " + fourth);



    }
}
