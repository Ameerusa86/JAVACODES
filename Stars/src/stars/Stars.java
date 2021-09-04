/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars;

/**
 *
 * @author eng_a
 */
public class Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int n = 6;

        for (i = 1; i <= n; i++) { //number of lines
            for (j = 1; j <= n - i; j++) 
                System.out.print(" ");
            

            for (j = 1; j <= i; j++) 
                System.out.print("*");
                System.out.println();
            }
        }
    }

            
        
       
    

