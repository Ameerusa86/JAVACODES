/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageprinter;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class AgePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userAge = 0;
      System.out.print("Enter your age: ");
      Scanner scnr = new Scanner(System.in);
      userAge = scnr.nextInt();
      System.out.println(userAge + 
                         " is a great age.");
      return;
   }
}