public class PersonInfo {
   private int numKids;
    String get;

   public void setNumKids(int personsKids) {
      numKids = personsKids;
   }

   public void incNumKids() {
      numKids = numKids + 1;
   }

   public int getNumKids() {
      return numKids;
   }
}
public class CallPersonInfo {
   public static void main (String [] args) {
      PersonInfo person1 = new PersonInfo();

      person1.setNumKids(3);
System.out.println("Kids: " + person1.getNumKids());

person1.incNumKids();

System.out.println("New baby, kids now: " + person1.getNumKids());

   }
}