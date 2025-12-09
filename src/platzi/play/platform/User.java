package platzi.play.platform;

import platzi.play.content.Movie;

/**
 * Represents a simple user of the platform.
 *
 * <p>This class holds public fields for the user's name and email and a
 * convenience method {@link #watch(Movie)} which prints a message that the
 * user is playing a movie. The class is deliberately minimal for teaching
 * purposes.</p>
 */
public class User {
    /** Public name field (example code uses public fields for simplicity). */
    public String name;

    /** Public email field. */
    public String email;

    /**
     * Simulate the user watching a movie by printing a message to stdout.
     *
     * @param movie the movie being watched
     */
    public void watch(Movie movie){
        System.out.println(name+" is Playing "+movie.getTitle());
    }
}
