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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a number between 50 and 100");
        int number = in.nextInt();
        
        int num = 100;
        
        while(number < 100 && number >= 50 && num > number){
            num = num - 5;
            System.out.println(num);
        }
        
        
        
    }
}
