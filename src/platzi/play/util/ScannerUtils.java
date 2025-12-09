package platzi.play.util;

import java.util.Scanner;

/**
 * Utility helper that wraps a single Scanner instance used by the CLI.
 *
 * <p>Provides small convenience methods to prompt the user and read
 * common primitive types: text, int and double. Each method prints the
 * provided message and returns the parsed value. The scanner is shared
 * as a public static field for simplicity in the educational example.</p>
 */
public class ScannerUtils {
    /** Shared Scanner instance reading from standard input. */
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Prompt user and read a full line of text.
     *
     * @param message prompt text to display
     * @return user's input line
     */
    public static String captureText(String message){ //can be used without object
        System.out.println(message+ ":");
        String data = scanner.nextLine();
        return data;
    }

    /**
     * Prompt user and read an integer. Consumes the trailing newline.
     * If the user enters invalid data a runtime exception from Scanner
     * will be thrown (no validation is performed here).
     *
     * @param message prompt text
     * @return parsed integer
     */
    public static int getNumber(String message){
        System.out.println(message+":");
        int data = scanner.nextInt();
        scanner.nextLine();
        return data;
    }

    /**
     * Prompt user and read a double. Consumes the trailing newline.
     *
     * @param message prompt text
     * @return parsed double value
     */
    public static double getDouble(String message){
        System.out.println(message+":");
        double data = scanner.nextDouble();
        scanner.nextLine();
        return data;
    }
}
