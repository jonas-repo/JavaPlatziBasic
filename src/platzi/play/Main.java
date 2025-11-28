package platzi.play;

import platzi.play.content.Movie;
import platzi.play.platform.User;
import platzi.play.util.ScannerUtils;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final  String VERSION = "1.0.0";
    public static final  String  PLATFORM_NAME = "Platzi Play";
    public static void main(String[] args) {

        System.out.println( PLATFORM_NAME+" v"+ VERSION + " hello and welcome!");

        String name = ScannerUtils.captureText("Movie name");
        String genre = ScannerUtils.captureText("Genre");
        int duration = ScannerUtils.getNumber("Movie Duration minutes");
        int year = ScannerUtils.getNumber("Year");
        double review = ScannerUtils.getDouble("Movie review");


        Movie movie = new Movie(name, duration, genre);
        movie.age = year;
        movie.reviewIt(review);

        System.out.println(movie.getTechInfo());
        User user = new User();
        user.name = "Walt";
        user.watch(movie);

    }
}