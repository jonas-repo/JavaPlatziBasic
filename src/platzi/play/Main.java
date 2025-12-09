package platzi.play;

import platzi.play.content.Movie;
import platzi.play.platform.Platform;
import platzi.play.platform.User;
import platzi.play.util.ScannerUtils;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final  String VERSION = "1.0.0";
    public static final  String  PLATFORM_NAME = "Platzi Play";
    public static final int EXIT = 5;
    public static final int DELETE = 4;
    public static final int SEARCH = 3;
    public static final int SHOW_ALL = 2;
    public static final int ADD = 1;
    public static void main(String[] args) {
        Platform platform = new Platform(PLATFORM_NAME);
        System.out.println( PLATFORM_NAME+" v"+ VERSION + " hello and welcome!");

        loadMovie(platform);

        while(true){
            int option = ScannerUtils.getNumber("""
                    Choose an option:
                    1. Add content
                    2. Show all
                    3. Search by title
                    4. Delete
                    5. Exit
                    """);
            System.out.println("Option chosen: " + option);
            switch(option){
                case ADD -> {
                    String name = ScannerUtils.captureText("Movie name");
                    String genre = ScannerUtils.captureText("Genre");
                    int duration = ScannerUtils.getNumber("Movie Duration minutes");
                    int year = ScannerUtils.getNumber("Year");
                    double review = ScannerUtils.getDouble("Movie review");


                    Movie movie = new Movie(name, duration, genre);
                    movie.setAge(year);
                    movie.reviewIt(review);
                    platform.add(movie);
                    System.out.println(movie.getTechInfo());
                }
                case SHOW_ALL -> {}
                case SEARCH ->  {
                    String nameMovie = ScannerUtils.captureText("Movie name:");
                    Movie movie = platform.searchByTitle(nameMovie);
                    if(movie != null){
                        System.out.println(movie.getTechInfo());

                    }
                    else {
                        System.out.println("Not found");
                    }

                }
                case DELETE -> {
                    String nameMovie = ScannerUtils.captureText("Movie to delete:");
                    Movie movie = platform.searchByTitle(nameMovie);
                    if(movie != null){
                        platform.remove(movie);
                        System.out.println("Movie deleted");
                    }
                    else {
                        System.out.println("Not found");
                    }
                }
                case EXIT -> {
                    System.exit(0);
                }
            }
        }


    }

    public static void loadMovie(Platform platform){
        platform.add(new Movie("lola",30,"anime"));
        platform.add(new Movie("trailera",30,"anime"));
    }
}