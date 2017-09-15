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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // arrays
        String[] words = new String[10];
        
        // input
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < words.length; i++){
            System.out.println("Enter a word");
            words[i] = in.nextLine();
            
        }
            int word0 = words[0].length();
            int word1 = words[1].length();
            int word2 = words[2].length();
            int word3 = words[3].length();
            int word4 = words[4].length();
            int word5 = words[5].length();
            int word6 = words[6].length();
            int word7 = words[7].length();
            int word8 = words[8].length();
            int word9 = words[9].length();
            
            int WordLengthAv = (word0 + word1 + word2 + word3 + word4 + word5 + word6 + word7 + word8 + word9) / 10;
            
            System.out.println("The average word length is " + WordLengthAv);
            
    }
}
