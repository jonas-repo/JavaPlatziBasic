package platzi.play.util;
import java.util.Scanner;

public class ScannerUtils {
    public static Scanner scanner = new Scanner(System.in);

    public static String captureText(String message){ //can be used without object
        System.out.println(message+ ":");
        return scanner.nextLine();
    }

    public static int getNumber(String message){
        System.out.println(message+":");
        int data = scanner.nextInt();
        return data;
    }

    public static double getDouble(String message){
        System.out.println(message+":");
        double data = scanner.nextDouble();
        return data;
    }
}
