/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shampoomethod;

/**
 *
 * @author eng_a
 */
public class ShampooMethod {

 public static void printShampooInstructions (int numCycles) {
  
if(numCycles<=1){
            System.out.println("Too few.");
        }
        else if(numCycles>4){
            System.out.println("Too many.");
        }
        else{
            for(int i=1;i<=numCycles;i++){
                System.out.println(i+": Lather and rinse.");
            }
            System.out.println("Done.");
        }
    }

    public static void main(String[] args) {
printShampooInstructions(2);
return;
    }
    
}
