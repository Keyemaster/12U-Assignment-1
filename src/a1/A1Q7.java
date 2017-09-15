/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;

/**
 *
 * @author keyew7019
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double PopI = 6.0;
        int YearI = 1999;
        
        double GrowthRate = 1.014;
        
        double PopN = PopI;
        
        while(PopN <= 10.0){
             PopN = PopN * GrowthRate;
             YearI = YearI + 1;
             System.out.println("The population will not exceed 10 billion in the year " + YearI);
        }
        if(PopN > 10.0){
        System.out.println("The population will exceed 10 billion in the year " + YearI);
        }
        
        
    }
}
