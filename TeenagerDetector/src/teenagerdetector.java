/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eng_a
 */
public class teenagerdetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isTeenager;
        int kidAge;

        kidAge = 21;

        if (kidAge >= 13 && kidAge <= 19) {
             
        isTeenager = true;

        }
        else {
          isTeenager = false;
}

        if (isTeenager) {
            System.out.println("Teen");
        } else {
            System.out.println("Not teen");
        }
    }
}
