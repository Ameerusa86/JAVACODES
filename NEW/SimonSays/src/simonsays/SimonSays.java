/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simonsays;

/**
 *
 * @author eng_a
 */
public class SimonSays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String simonPattern = "";
        String userPattern = "";
        int userScore = 0;
        int i = 0;

        userScore = 0;
        simonPattern = "RRGBRYYBGY";
        userPattern = "RRGPBRYBGY";
          for(i=0 ; i<simonPattern.length(); i++)

       if(simonPattern.charAt(i)==userPattern.charAt(i))

           {

               userScore+=1;

           }

           else

           {

               break;

           }
               
       System.out.println("userScore: " + userScore );
       
    }
  return;
   }

