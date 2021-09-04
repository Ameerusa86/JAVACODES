/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treestars;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class TreeStars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
Scanner A = new Scanner (System.in);
System.out.println("Enter Size: ");
int n = A.nextInt();

System.out.println("Enter your shape: ");
        char c = A.next().charAt(0);

        for (i = 1; i <= n; i++) { //number of lines
            for (j = 1; j <= n - i; ++j) //number of spces
            {
                System.out.print(" ");
            }

            for (j = 1; j <= 2 * i - 1; ++j) // number of stars
            {
                System.out.print(c);
            }
            System.out.println();
        }

        for (i = n; i > 0; i--) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < (i * 2) - 1; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
