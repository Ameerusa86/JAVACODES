/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthyear;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class MonthYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
      int birthMonth = 0;
      int birthYear  = 0;
      System.out.print("Enter your Month & Year?");
birthMonth = scnr.nextInt();
birthYear = scnr.nextInt();
System.out.println("You were born on " + birthMonth +"th month" + " in " + birthYear);





    }
    
}
