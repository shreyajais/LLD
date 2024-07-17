package LLD.BookMyShow.Service.Util;

import LLD.BookMyShow.Model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CatelogUtil {
    public void displayMovieListByCity(City city){
        List<Movie> movieList = new ArrayList<>();

    }

    public List<Movie> getAllMoviesListOnDate(Date date) {
        return null;
    }
    public List<showtimings> getListOfShowTimingForMovies(Movie movie, City city, LocalDateTime localDateTime){
        return null;
    }

    public List<Seat> getListOfAvailableSeatsForShow(Shows shows){
        return shows.getAvailableSeat();
    }
}
