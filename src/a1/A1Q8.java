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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the initial amount");
        int initial = in.nextInt();
        
        System.out.println("Please enter the interest rate");
        double R = in.nextDouble();
        
        double balance = initial;
        
        int years = 0;
        
        while(balance < initial*2){
             balance = (1 + R)* balance;
             years = years + 1;
        }
        System.out.println("The money will double in " + years + " years");
        while(balance < 1000000){
            balance = (1 + R)* balance;
            years = years + 1;
        }
        System.out.println("The money will reach 1 million dollars in " + years + " years");
        
        
    }
}
