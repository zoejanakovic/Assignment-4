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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner for user input
        Scanner input = new Scanner(System.in);
        
        //counter
        int counter = 1;
        
        //loop 
        while(true){
            //get number on dice and store as a variable
            System.out.println("Enter sum of dice");
            int sum = input.nextInt();
            
            //determine the square you will got o
            int square = counter + sum;
            
            counter = square;
            
            if (counter < 100 && counter != 0 && counter != 100 && counter != 54 && counter != 90 && counter != 99 && counter != 9 && counter != 40 && counter != 67){
                System.out.println("You are now on square " + square);
            } else if (counter == 100){
                System.out.println("You are now on square 100");
                System.out.println("You Win!");
                break;
            } else if (counter == 0){
                System.out.println("You Quit!");
                break;
            }else if (counter == 54){
                counter = 19; 
                System.out.println("You are now on square " + counter);
            }else if (counter == 90){
                counter = 48;
                System.out.println("You are now on square " + counter);
            }else if (counter == 99){
                counter = 77;
                System.out.println("You are now on square " + counter);
            }else if (counter == 9){
                counter = 34;
                System.out.println("You are now on square " + counter);
            }else if (counter == 40){
                counter = 64;
                System.out.println("You are now on square " + counter);
            }else if (counter == 67){
                counter = 86;
                System.out.println("You are now on square " + counter);
            }else if (counter > 100){
                counter = square - sum;
                System.out.println("You are now on square " + counter);
            }
              
        }
    }
}
