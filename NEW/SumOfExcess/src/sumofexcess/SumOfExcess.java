/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofexcess;

/**
 *
 * @author eng_a
 */
public class SumOfExcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_VALS = 4;
      int[] testGrades = new int[NUM_VALS];
      int i = 0;
      int sumExtra = -9999; // Assign sumExtra with 0 before your for loop

      testGrades[0] = 101;
      testGrades[1] = 83;
      testGrades[2] = 107;
      testGrades[3] = 90;
      
sumExtra =0;      
for (i=0; i<NUM_VALS;++i){
if (testGrades[i] > 100){
sumExtra =sumExtra + (testGrades [i] - 100);

}
}

  System.out.println("sumExtra: " + sumExtra);

      return;
   }
    }
