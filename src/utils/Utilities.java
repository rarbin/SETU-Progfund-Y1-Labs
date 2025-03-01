package utils;

public class Utilities {

    /**
     * This method takes in a decimal point number and truncates it to two decimal places.  Note
     * that the method does NOT round when truncating; the numbers after the two decimal places are
     * just removed.
     *
     * The method does the truncating in this manner:
     *  - multiply the number by 100 e.g. 16.543235523 * 100 = 1654.3235523
     *  - cast the multiplied number as an in e.g. 1654.3235523 = 1654
     *  - finally, the multiplied and cast number is divided by 100 and returned e.g. 1654 = 16.54
     *
     * @param number  Number to be truncated to two decimal places
     * @return  the number, passed as a parameter, truncated to two decimal places (note: not rounded)
     */
    public static double toTwoDecimalPlaces(double number){
        return (int) (number * 100 ) / 100.0;
    }

    public static boolean YNtoBoolean(char charToConvert){
        return ((charToConvert == 'y') || (charToConvert == 'Y'));
    }

    public static String truncateString(String stringToTruncate, int length) {
        if (stringToTruncate.length() <= length) {
            return stringToTruncate;
        } else {
            return stringToTruncate.substring(0, length);
        }
    }
    public static boolean validateStringLength(String strToCheck, int maxLength){
        return strToCheck.length() <= maxLength;
    }
    /**
     * This method returns true if the numberToCheck is between min and max (both inclusive)
     *
     * @param numberToCheck The number whose range is being checked.
     * @param min The minimum range number to check against (inclusive)
     * @param max The maximum range number to check against (inclusive)
     * @return Returns true if the numberToCheck is between min and max (both inclusive), false otherwise.
     */

    public static boolean validRange(int numberToCheck, int min, int max){
        return numberToCheck >= min && numberToCheck <= max;
    }
    public static char booleanToYN(boolean booleanToConvert){
        return booleanToConvert ? 'Y' : 'N';
    }

}