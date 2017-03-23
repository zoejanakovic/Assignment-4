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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner to ask for user input
        Scanner input = new Scanner(System.in);
        //ask user to input name
        System.out.println("Please enter your name.");
        //scan name into a variable
        String name = input.nextLine();
        //say hello their name and how are you today
        System.out.println("Hello " + name + ". How are you today?");

    }
}
