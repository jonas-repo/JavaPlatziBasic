package platzi.play;

import platzi.play.content.Movie;
import platzi.play.platform.User;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
       /* System.out.println("Platzi Play! hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name+ ", this is platzi play");
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println(name+ " you can watch +" +age);*/

        movie.title = "lord of the rings";
        movie.age = 2001;
        movie.genre = "fantasy";
        movie.reviewIt(4.7);

        System.out.println(movie.getTechInfo());
        User user = new User();
        user.name = "Walt";
        user.watch(movie);

    }
}