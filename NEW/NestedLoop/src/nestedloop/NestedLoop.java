/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloop;

/**
 *
 * @author eng_a
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userNum = 2;
        int i = 0; // for numbers
        int j = 0; // for spaces
        for (i = 0; i <= userNum; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(i);
        }

        return;
    }
}
