/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmatchvalue;

/**
 *
 * @author eng_a
 */
public class FindMatchValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_VALS = 4;
        int[] userValues = new int[NUM_VALS];
        int i;
        int matchValue;
        int numMatches = -99; // Assign numMatches with 0 before your for loop

        userValues[0] = 0;
        userValues[1] = 0;
        userValues[2] = 0;
        userValues[3] = 0;
        matchValue = 2;

        numMatches =0;
        {for (i=0;i<NUM_VALS; ++i){
            if( matchValue != userValues[i]){
                ++numMatches;
            }
        }
             
        System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
    }
    }
}
