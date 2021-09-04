/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostpopularos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class MostPopularOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> operatingSystems = new ArrayList<String>();
        int nthOS = 1; // User input, Nth most popular OS

        // Source: Wikipedia.org, 2013
        operatingSystems.add(new String("Windows 7"));
        operatingSystems.add(new String("Windows XP"));
        operatingSystems.add(new String("OS X"));
        operatingSystems.add(new String("Windows Vista"));
        operatingSystems.add(new String("Windows 8"));
        operatingSystems.add(new String("Linux"));
        operatingSystems.add(new String("Other"));

        System.out.print("Enter N (1-7): ");
        nthOS = scnr.nextInt();

        if ((nthOS >= 1) && (nthOS <= 7)) {
           if (nthOS == 2) {
                System.out.print("The " + nthOS + "nd most popular OS is ");
                System.out.println(operatingSystems.get(nthOS - 1));
            }
          else if (nthOS == 3) {
                System.out.print("The " + nthOS + "rd most popular OS is ");
                System.out.println(operatingSystems.get(nthOS - 1));
            }
        } else {
            System.out.print("The " + nthOS + "th most popular OS is ");
            System.out.println(operatingSystems.get(nthOS - 1));

        }

        return;
    }
}
