/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberprompt;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class NumberPrompt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
   int userInput = 0;
 do {
userInput = scnr.nextInt();
     System.out.println("Enter a nmber (<100):" + "");

}
while (userInput > 100);
 System.out.println("Your number < 100 is: " + userInput);
    }

   }

