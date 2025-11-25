package platzi.play.content;

public class Movie {
    public String title;
    public String description;
    public String duration;
    public String genre;
    public int age;
    public double review;
    public boolean available;

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
}
