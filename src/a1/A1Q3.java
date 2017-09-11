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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Expenses for food:");
        double food = in.nextDouble();
      
        System.out.println("Expenses for DJ:");
        double DJ = in.nextDouble();
        
        System.out.println("Expenses for hall rental:");
        double hall = in.nextDouble();
        
        System.out.println("Expenses for decorations:");
        double decorations = in.nextDouble();
        
        System.out.println("Expenses for wait staff:");
        double wait = in.nextDouble();
        
        System.out.println("Expenses for miscellaneous:");
        double miscellaneous = in.nextDouble();
        
        double tickets = food + DJ + hall + decorations + wait + miscellaneous;
        System.out.println("The total expenses are: " + tickets);
        
        double price = Math.ceil(tickets / 35);
        System.out.println("To break even " + price + " amount of tickets that need to be sold");
                
    }
}
