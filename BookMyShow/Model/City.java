package LLD.BookMyShow.Model;

import java.util.ArrayList;
import java.util.List;

public class City {
    String id;
    String name;

    List<Shows> shows;

    List<Movie> movieList;

    public City(String id, String name, List<Shows> Shows) {
        this.id = id;
        this.name = name;
        this.shows = Shows;
        this.movieList = null;
    }

    public List<City> getListOfAllCities(){
        return new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Shows> getShowsList() {
        return shows;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie movie){
        getMovieList().add(movie);
    }
    public void removeMovie(Movie movie){
        getMovieList().remove(movie);
    }

    // getter and setters
}
