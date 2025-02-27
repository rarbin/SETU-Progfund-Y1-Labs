package utils;

import java.util.Scanner;
//class gets rid of scanner bug by creating a new object for each user read,
//also validates the data to ensure it is correct or doesn't accept it from the user
public class ScannerInput {
//user is prompted to enter an int which is then read by scanner class, must be an actual int
    public static int readNextInt(String prompt) {
        do {
            var scanner = new Scanner(System.in);
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.next());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }

    //user is prompted to enter a double which is then read by scanner class, must be an actual double
    public static double readNextDouble(String prompt) {
        do {
            var scanner = new Scanner(System.in);
            try{
                System.out.print(prompt);
                return Double.parseDouble(scanner.next());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }

    //user is prompted to enter a string which is then read by scanner class, must be an actual string
    public static String readNextLine(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();
    }
    //user is prompted to enter an char which is then read by scanner class, must be an actual char
    public static char readNextChar(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.next().charAt(0);
    }

}
