/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketcounter;

/**
 *
 * @author eng_a
 */
public class TicketCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numTickets = 0;
        int userTickets = 8;
        if (userTickets < 5) {
            numTickets = 1;
        } else {
            numTickets = userTickets;
        }
        System.out.println(numTickets);

    }
}
