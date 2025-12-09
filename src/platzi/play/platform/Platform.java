package platzi.play.platform;

import platzi.play.content.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple in-memory container representing the streaming platform.
 *
 * <p>The Platform holds a list of Movie objects and provides basic
 * operations to add, remove, list titles and find a movie by its title.</p>
 *
 * <p>This is intentionally minimal and uses an ArrayList; search is
 * case-insensitive and returns the first match or null if not found.</p>
 */
public class Platform {
    /** Platform name (display purposes). */
    private String name;

    /** Internal storage for the platform content. */
    private List<Movie> content;

    /**
     * Create a Platform with a human friendly name.
     *
     * @param name the platform name
     */
    public Platform(String name){
        this.name = name;
        this.content = new ArrayList<>();
    }

    /**
     * Add a Movie to the platform's content list.
     *
     * @param element movie instance to add
     */
    public void add(Movie element){
        this.content.add(element);
    }

    /**
     * Return the internal content list. Caller may iterate but should
     * not rely on modification semantics of the returned list.
     *
     * @return list of movies
     */
    public List<Movie> getContent() {
        return content;
    }

    /**
     * Print titles of all movies to stdout, one per line.
     */
    public void showTitles(){
        content.forEach(movie ->
                System.out.println(movie.getTitle()));
    }

    /**
     * Search for a movie by its title using case-insensitive comparison.
     * Returns the first match or null if none found.
     *
     * @param title title to search for
     * @return matching Movie or null
     */
    public Movie searchByTitle(String title){

        return content.stream().filter(content ->
                content.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    /**
     * Remove the supplied movie instance from the content list.
     *
     * @param element movie to remove
     */
    public void remove(Movie element){

        this.content.remove(element);
    }


}
