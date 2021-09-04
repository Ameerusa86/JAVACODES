
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eng_a
 */
public class roshambo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nextChoice = 0;
        nextChoice = 2;
        Scanner scnr = new Scanner(System.in);
        nextChoice = scnr.nextInt();

        switch (nextChoice) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }

}
