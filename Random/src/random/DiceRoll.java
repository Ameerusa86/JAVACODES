package random;


import java.util.Random;

public class DiceRoll {
   public static void main (String [] args) {
      Random randGen = new Random();
      int seedVal = 0;
      randGen.setSeed(seedVal);

System.out.println(randGen.nextInt(10));
System.out.println(randGen.nextInt(10));
      return;
   }
}
