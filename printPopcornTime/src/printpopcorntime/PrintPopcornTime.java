/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpopcorntime;

import java.util.Scanner;

/**
 *
 * @author eng_a
 */
public class PrintPopcornTime {

   public static void printPopcornTime(int bagOunces) {
       
Scanner scnr = new Scanner(System.in);
bagOunces = scnr.nextInt();


if (bagOunces <3){
System.out.println ("Too small");
}

else if (bagOunces >10){
System.out.println("Too large");
}

else {
System.out.println((6 * bagOunces) + " seconds");
}

   }

    public static void main(String[] args) {
        printPopcornTime(7);

      return;
   }
}