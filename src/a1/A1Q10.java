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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // input
        Scanner in = new Scanner(System.in);
        
        
        String word = "";
        int count = 0;
       
        while(word.equals(word)){
            System.out.println("Enter a word");
            word = in.nextLine();
            if(!(word.equals("Exit"))){
            count = count + 1;
            }
            if(word.matches("Exit")){
            System.out.println("The user has typed " + count + " words");
            break;
        }
        }
        
        
        
    }
}
