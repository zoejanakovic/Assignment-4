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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner for user input
        Scanner input = new Scanner(System.in);

        //ask to enter speed limit and store as a variable
        System.out.println("Enter the speed limit");
        int limit = input.nextInt();

        //ask to enter the recorded speed of the car and store as a variable
        System.out.println("Enter the recorded speed of the car");
        int speed = input.nextInt();

        //calculate difference
        int difference = limit - speed;

        //if difference >=0, in the speed limit
        if (difference >= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
            //if difference <0 and >= -20 $100
        } else if (difference < 0 && difference >= -20) {
            System.out.println("You are speeding and your fine is $100.");
            //if difference <-20 and >= -30 $270
        } else if (difference < -20 && difference >= -30){
            System.out.println("You are speeding and your fine is $270.");
            //if difference <-30 $500
        } else if (difference < -30){
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
