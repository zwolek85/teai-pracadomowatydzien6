package pl.zwolek.teai.pracadomowatydzien6.movieaop.movieaop.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/move/")
class MovieController {

    private final MovieService movieService;

    @Autowired
    MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    ResponseEntity<List<Movie>> getMovieList() {
        List<Movie> movieList = movieService.getMovieList();
        return ResponseEntity.ok(movieList);
    }

    @PostMapping
    ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        movieService.addMovieList(movie);
        return ResponseEntity.ok(movie);
    }
}
