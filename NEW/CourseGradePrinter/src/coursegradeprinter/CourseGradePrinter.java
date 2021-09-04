/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursegradeprinter;

/**
 *
 * @author eng_a
 */
public class CourseGradePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_VALS = 4;
        int[] courseGrades = new int[NUM_VALS];
        int i = 0;

        courseGrades[0] = 7;
        courseGrades[1] = 9;
        courseGrades[2] = 11;
        courseGrades[3] = 10;
        
for (i=0; i< NUM_VALS; ++i){
    System.out.println(courseGrades [i] + " ");
}
for (i=NUM_VALS-1; i>=0; --i){
    System.out.println(courseGrades [i] + " ");
}
return;
    }
}
    

