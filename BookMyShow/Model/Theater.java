package LLD.BookMyShow.Model;

import java.util.List;

public class Theater {
    String id;
    String name;
    String address;
    String contact;
    String email;
    List<Movie> movieList;
    List<Audi> audiList;
    List<Shows> showsList;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public List<Audi> getAudiList() {
        return audiList;
    }

    public List<Shows> getShowsList() {
        return showsList;
    }
}
// getter and setter