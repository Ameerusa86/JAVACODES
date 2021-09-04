import java.util.Scanner;

public class SearchForDomainName {                         

   public static void main(String [ ] args) { 
      Scanner scnr = new Scanner(System.in);
      String inputName  = "";
      String searchName = "";
      String coreGtld1 = ".com";
      String coreGtld2 = ".net";
      String coreGtld3 = ".org";
      String coreGtld4 = ".info";
      boolean isCoreGtld = false;

      System.out.println("\nEnter a top-level domain name: ");
      inputName  = scnr.nextLine();
      searchName = inputName.toLowerCase();

      // If the user entered a name without a leading period, add one
      if ((searchName.length() > 0) && (searchName.charAt(0) != '.')) {
         searchName = "." + searchName;
      }

      // See if the domain name entered is a generic top-level domain name
      if (searchName.compareTo(coreGtld1) == 0) {
         isCoreGtld = true;
      }
      else if (searchName.compareTo(coreGtld2) == 0) {
         isCoreGtld = true;
      }
      else if (searchName.compareTo(coreGtld3) == 0) {
         isCoreGtld = true;
      }
      else if (searchName.compareTo(coreGtld4) == 0) {
         isCoreGtld = true;
      }
      else {
         isCoreGtld = false;
      }

      System.out.print("The name \"" + inputName + "\" ");
      if (isCoreGtld) {
         System.out.println("is a core gTLD.");
      }
      else {
         System.out.println("is not a core gTLD.");
      }

      return;
   } 
}