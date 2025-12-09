package platzi.play.platform;

import platzi.play.content.Movie;

public class User {
    public String name;
    public String email;

    public void watch(Movie movie){
        System.out.println(name+" is Playing "+movie.getTitle());
    }
}
