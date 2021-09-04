/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainnameprinte;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class DomainNamePrinte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char letter1 = '?';
        char letter2 = '?';

        System.out.println("Two-letter domain names:");

        letter1 = 'a';
        while (letter1 <= 'j') {
            letter2 = 'a';
            while (letter2 <= 'j') {
                System.out.println("" + letter1
                        + "" + letter2 + ".com");
                ++letter2;
                letter2 = '0';

                while (letter2 <= '9' && letter2 >= '0') {

                    System.out.println("" + letter1 + "" + letter2 + ".com");
                    ++letter2;

                }
            }
            ++letter1;
        }

        return;
    }
}
