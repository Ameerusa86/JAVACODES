/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faceprint;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class FacePrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        char userChar ='_';
        String userInput = "";
        
        // Starting Loop
        while (userChar != 'q'){
            System.out.println(userChar + " " + userChar);
            System.out.println(" " + userChar);
            System.out.println("" + userChar +"" + userChar +"" + userChar);
           
            System.out.println("Please enter Q to quit");
            userInput = scnr.next();
            userChar = userInput.charAt(0);
            System.out.println("");
        }
        System.out.println("GOODBYE!!");
    }
    
}
