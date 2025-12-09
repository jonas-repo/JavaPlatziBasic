package platzi.play;

import platzi.play.content.Movie;

public class MainStackHeap {
    public static void main(String[] args){
        Movie kingLeon = new Movie("Lion King", 123, "cartoon");
        Movie stack = new Movie("1",1,"1");
        kingLeon = stack;
        System.out.println("Lion King: " + kingLeon.getTitle() + kingLeon.getDuration() + kingLeon.getGenre());
    }
}
