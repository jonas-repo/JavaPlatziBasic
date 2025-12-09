package platzi.play;

import platzi.play.content.Movie;

/**
 * Small example demonstrating object references and the heap/stack concept.
 *
 * <p>The code creates two Movie objects and then reassigns the variable
 * reference to illustrate that both variables can point to the same
 * object instance. The example prints the current title/duration/genre
 * from the referenced object.</p>
 */
public class MainStackHeap {
    public static void main(String[] args){
        Movie kingLeon = new Movie("Lion King", 123, "cartoon");
        Movie stack = new Movie("1",1,"1");
        kingLeon = stack;
        System.out.println("Lion King: " + kingLeon.getTitle() + kingLeon.getDuration() + kingLeon.getGenre());
    }
}

