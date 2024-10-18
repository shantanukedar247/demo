package alm.demo.java;

public class AirportCodeValidator

{

   public static boolean isValid(String code) {
       return IATARulesValidator.isValidAirportCode(code);


   }
}
