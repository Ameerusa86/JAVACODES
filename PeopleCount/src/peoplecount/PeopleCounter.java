public class PeopleCounter {

   // Variable to store number of people counted
   private int numPeople;

   // Default constructor initializes count to 0
   public PeopleCounter() {
      numPeople = 0;
   }

   // Increments counts by 1
   public void incrementCount() {
      numPeople = numPeople + 1;
      return;
   }

   // Resets count to 0
   public void resetCount() {
      numPeople = 0;
      return;
   }

   // Display current count
   public void printCount() {
      System.out.print(numPeople);
      return;
   }

   // Returns current count
   public int getCount() {
      return numPeople;
   }
}
