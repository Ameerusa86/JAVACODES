
import java.io.PrintStream;

public class DogLicense {
   private int licenseYear;
   private int licenseNum;

   public void setYear(int yearRegistered) {
      licenseYear = yearRegistered;
   
   }

    String getLicenseNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 public void LicenseNum() {
        licenseNum = (licenseNum * 100000) + licenseYear;
public int getLicenseNum() {
      return licenseNum;
   }
}
public class CallDogLicense {
   public static void main (String [] args) {
      DogLicense dog1 = new DogLicense();

      dog1.setYear(2014);
      dog1.createLicenseNum(777);
       PrintStream println = System.out.println("Dog license: " + dog1.getLicenseNum());

   }
}
   