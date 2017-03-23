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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner for user input
        Scanner input = new Scanner(System.in);

        //ask for name and scan into a variable
        System.out.println("Please enter your name.");
        String name = input.nextLine();

        //ask about each of their 5 tests and scan each value into a variable
        System.out.println("What was the first test out of?");
        double one = input.nextDouble();

        System.out.println("What mark did you get?");
        double markOne = input.nextDouble();

        System.out.println("What was the second test out of?");
        double two = input.nextDouble();

        System.out.println("What mark did you get?");
        double markTwo = input.nextDouble();

        System.out.println("What was the third test out of?");
        double three = input.nextDouble();

        System.out.println("What mark did you get?");
        double markThree = input.nextDouble();

        System.out.println("What was the fourth test out of?");
        double four = input.nextDouble();

        System.out.println("What mark did you get?");
        double markFour = input.nextDouble();

        System.out.println("What was the fifth test out of?");
        double five = input.nextDouble();

        System.out.println("What mark did you get?");
        double markFive = input.nextDouble();

        //calculate percents and average
        double first = markOne / one * 100;

        double second = markTwo / two * 100;

        double third = markThree / three * 100;

        double fourth = markFour / four * 100;

        double fifth = markFive / five * 100;

        double average = (first + second + third + fourth + fifth) / 5;

        //output the scores and average
        System.out.println("Test Scores for " + name);
        System.out.println("Test 1: " + first + "%");
        System.out.println("Test 2: " + second + "%");
        System.out.println("Test 3: " + third + "%");
        System.out.println("Test 4: " + fourth + "%");
        System.out.println("Test 5: " + fifth + "%");
        System.out.println("Average: " + average + "%");


    }
}
