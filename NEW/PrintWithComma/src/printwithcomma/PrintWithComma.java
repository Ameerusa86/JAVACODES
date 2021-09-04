/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printwithcomma;

/**
 *
 * @author eng_a
 */
public class PrintWithComma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_VALS = 4;
        int[] hourlyTemp = new int[NUM_VALS];
        int i = 0;

        hourlyTemp[0] = 90;
        hourlyTemp[1] = 92;
        hourlyTemp[2] = 94;
        hourlyTemp[3] = 95;

        for (i = 0; i < NUM_VALS; ++i) 
            if (i == NUM_VALS - 1) {
                System.out.print(hourlyTemp[i]);
            } 
        else{
                System.out.print(hourlyTemp[i] + ", ");
            }

            System.out.println("");

            return;
        }
    }

