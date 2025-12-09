package platzi.play.content;

/**
 * Represents a Movie content item available on the platform.
 *
 * <p>This class stores basic metadata for a movie: title, description,
 * duration (in minutes), genre, year (used here as "age"), and a numeric
 * review score. It exposes simple behaviors such as playing the movie
 * (prints a message), recording a review score, and producing a
 * human-readable technical information string.</p>
 *
 * <p>Notes:
 * - The constructor requires title, duration and genre.
 * - review scores are clamped to the valid range 0..5 when set via
 *   {@link #reviewIt(double)}.
 * - {@link #isPopular()} returns true for reviews >= 4.</p>
 */
public class Movie {
    /** The movie title (human readable). */
    private String title;

    /** Optional longer description or synopsis. */
    private String description;

    /** Duration in minutes. */
    private int duration;

    /** Movie genre, e.g. "action", "drama". */
    private String genre;

    /** Year or age value associated with the movie (setter used in examples). */
    private int age;

    /** Numeric review score in the range 0..5. */
    private double review;

    /** Whether the movie is currently available (not used by current code). */
    private boolean available;

    /**
     * Create a new Movie with required fields.
     *
     * @param title movie title
     * @param duration duration in minutes
     * @param genre genre label
     */
    public Movie(String title, int duration, String genre){
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    /**
     * Simulate playing the movie by printing a message to stdout.
     */
    public void play(){
        System.out.println("Playing " + title);
    }

    /**
     * Returns a small multi-line string that includes title, age, genre and review.
     * This is intended for quick CLI display and is not localized.
     *
     * @return technical information about the movie
     */
    public String getTechInfo(){
        return title + "(" + age+ ")\n" +
                "Genre: " + genre + "\n" +
                "review: " + review;
    }

    /**
     * Record a review score for this movie. Only values in the inclusive
     * range [0, 5] are accepted; invalid values are ignored.
     *
     * @param review numeric review score (0..5)
     */
    public void reviewIt (double review){
        if(review >= 0 && review <=5){
            this.review = review;
        }
    }

    /**
     * Convenience predicate: consider the movie "popular" when its review >= 4.
     *
     * @return true if review >= 4
     */
    public boolean isPopular(){
        return review >=4;
    }

    /* --- Getters and setters --- */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getReview() {
        return review;
    }

}
