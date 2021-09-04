/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversation;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class Conversation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner scnr = new Scanner(System.in);
      int randNum0_3 = 0;   // Random number 0 to 3
      String userText = ""; // User input

      System.out.print("Tell me something about yourself. ");
      System.out.println("You can type \"Goodbye\" at anytime to quit.\n");
      System.out.print("> ");

      userText = scnr.nextLine();

      while (!userText.equals("Goodbye")) {
         randNum0_3 = userText.length() % 4; // "Random" num. %4 ensures 0-3
         switch (randNum0_3) {
            case 0:
               System.out.println("\nPlease explain further.\n");
               System.out.print("> ");
               break;

            case 1:
               System.out.println("\nWhy do you say: \"" + userText + "\"?\n");
               System.out.print("> ");
               break;

            case 2:
               System.out.println("\nI don't think that's right.\n");
               System.out.print("> ");
               break;

            case 3:
               System.out.println("\nWhat else can you share?\n");
               System.out.print("> ");
               break;

            default:
               System.out.println("\nUh-oh, something went wrong. Try again.\n");
         }

         userText = scnr.nextLine();
      }

      System.out.println("\nIt was nice talking with you. Goodbye.\n");

      return;
   }
}
    
    

