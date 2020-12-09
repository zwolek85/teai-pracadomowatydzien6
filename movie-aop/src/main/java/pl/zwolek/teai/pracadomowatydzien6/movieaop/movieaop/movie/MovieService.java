package pl.zwolek.teai.pracadomowatydzien6.movieaop.movieaop.movie;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.zwolek.teai.pracadomowatydzien6.movieaop.movieaop.aop.SendMail;

import java.util.ArrayList;
import java.util.List;

@Service
class MovieService {

    private List<Movie> movieList = new ArrayList<>();

    List<Movie> getMovieList() {
        return movieList;
    }

    @SendMail
    void addMovieList(Movie movie) {
        movieList.add(movie);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        movieList.add(new Movie("DR. NO", 1962, "Terence Young"));
        movieList.add(new Movie("Terminator", 1984, "James Cameron"));
        movieList.add(new Movie("Matrix", 1999, "Lana Wachowski, Lilly Wachowski"));

    }

}
