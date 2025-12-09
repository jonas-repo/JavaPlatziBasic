package platzi.play.platform;

import platzi.play.content.Movie;

import java.util.ArrayList;
import java.util.List;

public class Platform {
    private String name;
    private List<Movie> content;
    public Platform(String name){
        this.name = name;
        this.content = new ArrayList<>();
    }

    public void add(Movie element){
        this.content.add(element);
    }

    public List<Movie> getContent() {
        return content;
    }

    public void showTitles(){
        for(Movie movie : content){
            System.out.println(movie.getTitle());
        }
    }

    public Movie searchByTitle(String title){
        for(Movie movie : content){
            if(movie.getTitle().equalsIgnoreCase(title))
            {
                return movie;
            }
        }
        return null;
    }

    public void remove(Movie element){
        this.content.remove(element);
    }
}
