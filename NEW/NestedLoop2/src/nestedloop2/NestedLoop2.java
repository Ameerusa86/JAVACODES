/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloop2;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class NestedLoop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows = 2;
        int numCols = 3;
        int currentRow;
        int currentColumn;
        char currentColumnLetter;

        for (int i = 1; i <= numRows; i++) {

            currentColumnLetter = 'A';
            for (int x = 1; x <= numCols; x++) {
                System.out.print(i);
                System.out.print(currentColumnLetter + " ");
                currentColumnLetter++;
            }

        }

        System.out.println("");
    }
}
