import java.util.Scanner;

public class IncomeTax {    
   // Method to prompt for and input an integer
   public static int promptForInteger(Scanner input, String userPrompt) {
      int inputValue = 0;
      
      System.out.println(userPrompt + ": ");
      inputValue = input.nextInt();
      
      return inputValue;
   }

   // *********************************************************************** 

   // Method to get a value from one table based on a range in the other table
   public static double getCorrespondingTableValue(int search, int [] baseTable, double [] valueTable) {
      int baseTableLength = baseTable.length;
      double value = 0.0;
      int i = 0;
      boolean keepLooking = true;

      i = 0;
      while ((i < baseTableLength) && keepLooking) {
         if (search <= baseTable[i]) {
            value = valueTable[i];
            keepLooking = false;
         }
         else {
            ++i;
         }
      }

      return value;
   }

   // *********************************************************************** 

   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      int annualSalary = 0;
      double taxRate = 0.0;
      int taxToPay = 0;
      int i = 0;
      final String USER_PROMPT = "\nEnter annual salary (negative to exit)";

      // The first entries in the two tables are 0 to catch annualSalary < 0
      int [] salaryBase = {   0,     20000,     50000,     100000,     999999999 };
      double [] taxBase = { 0.0,      0.10,      0.20,       0.30,          0.40 };
    
      annualSalary = promptForInteger(scnr, USER_PROMPT);

      while (annualSalary >= 0) {
         taxRate = getCorrespondingTableValue(annualSalary, salaryBase, taxBase);

         taxToPay= (int)(annualSalary * taxRate);     // Truncate tax to an integer amount
         System.out.println("Annual salary: " + annualSalary + 
                            "\nTax rate: " + taxRate +
                            "\nTax to pay: " + taxToPay);

         // Get the next annual salary
         annualSalary = promptForInteger(scnr, USER_PROMPT);
      } 

      return;
   }
}
