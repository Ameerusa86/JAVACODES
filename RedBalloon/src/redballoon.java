/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eng_a
 */
public class redballoon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isRed = false;
        boolean isBalloon = false;
        
        if (isBalloon == true && isRed == false) {
            System.out.println("Balloon");
        }
        else if (isBalloon == true && isRed == true){
            System.out.println ("Red balloon");
        }
        else{
            System.out.println ("Not a balloon");
            
        }
    }

}
