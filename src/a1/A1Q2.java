/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;

import java.util.Scanner;

/**
 *
 * @author keyew7019
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create int size to 3
        int[]num = new int[3]; 
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < num.length; i++){
            System.out.println("Please enter a number");
            num[i] = in.nextInt();
            
        }
        // multiply the numbers and get the product
        int numproduct = num[0] * num[1] * num[2];
        System.out.println("The product of the numbers is: " + numproduct);
        
        // get the square of the product
        int numsquared = (int) Math.pow(numproduct, 2);
        System.out.println("The product squared is: " + numsquared);
        
        // get the square root of the product
        int numsquareroot = (int) Math.sqrt(numproduct);
        System.out.println("The square root of the product is: " + numsquareroot);
    }
}
