package alm.demo.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IATARulesValidator {


    public static boolean isValidFlightDesignator(String flightDesignator) {
        if (flightDesignator == null || flightDesignator.length() == 0) {
            return false;
        }

        if (flightDesignator.length() < 3 || flightDesignator.length() > 7) {
            return false;
        }

        if (!Character.isAlphabetic(flightDesignator.charAt(0)) ||
                !Character.isAlphabetic(flightDesignator.charAt(1))) {
            return false;
        }

        for (int i = 2; i < flightDesignator.length(); i++) {
            if (!Character.isDigit(flightDesignator.charAt(i))) {
                return false;
            }
        }

        return true;
    }
























    public static boolean isValidFlightNumber(String flightNumber) {
        if (flightNumber == null) {
            return false;
        }

        String regex = "^[A-Za-z]{2}\\d{1,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(flightNumber);

        return matcher.matches();
    }


    public static boolean isValidAirportCode(String airportCode) {
        if (airportCode == null || airportCode.length() != 3) {
            return false;
        }


        for (int i = 0; i < airportCode.length(); i++) {
            if (!Character.isUpperCase(airportCode.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //check that a Flight origin or destination is valid
        String originAirportCode = "LAX";
        if (IATARulesValidator.isValidAirportCode(originAirportCode)) {
            System.out.println(originAirportCode + " is a valid origin airport code");
        }
    }
}
