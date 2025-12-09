package platzi.play.content;

public class Movie {
    private String title;
    private String description;
    private int duration;
    private String genre;
    private int age;
    private double review;
    private boolean available;

    public Movie(String title, int duration, String genre){
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public void play(){
        System.out.println("Playing " + title);
    }

    public String getTechInfo(){
        return title + "(" + age+ ")\n" +
                "Genre: " + genre + "\n" +
                "review: " + review;
    }

    public void reviewIt (double review){
        if(review >= 0 && review <=5){
            this.review = review;
        }
    }

    public boolean isPopular(){
        return review >=4;
    }

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
