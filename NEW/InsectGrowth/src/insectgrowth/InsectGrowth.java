/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insectgrowth;

/**
 *
 * @author eng_a
 */
public class InsectGrowth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numInsects = 0;

        numInsects = 8; // Must be >= 1

        while (numInsects < 100) {
            System.out.print(numInsects + " ");
            numInsects = numInsects * 2;
        }
        System.out.println();
        return;
    }
}
