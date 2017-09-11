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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Please enter a number between 1 and 10");
        int number = in.nextInt();
        
        
        if(number <= 10 && number >= 1){
            for(int i = 0; i < number ;i++){
                for(i = 0; i < number ;i++){
                System.out.print("*");
                }
                System.out.println("");
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
}
