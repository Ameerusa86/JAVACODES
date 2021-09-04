/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electionyears;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class ElectionYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalVal = 0;
        int userInt = 0;

        // FIXME: Ask user to input an integer, store in userInt
        userInt = scnr.nextInt();
        totalVal = userInt;
        // FIXME: Add while loop that counts down to 1, updating totalVal
        while (userInt > 1){
            userInt = userInt -1;
            totalVal = userInt * totalVal;
        }

        System.out.println(userInt + "! is " + totalVal);
    }
}
