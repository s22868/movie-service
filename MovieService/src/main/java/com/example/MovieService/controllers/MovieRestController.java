package com.example.MovieService.controllers;

import com.example.MovieService.movie.Movie;
import com.example.MovieService.services.MoviesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MovieRestController {
    private final MoviesService moviesService;

    public MovieRestController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.status(200).body(moviesService.getAllMovies());
    }
    @GetMapping("/movies/addTest")
    public ResponseEntity<Movie> fillData(){
        return ResponseEntity.status(200).body(moviesService.fillDatabase());
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {
        Movie mov = moviesService.getMovie(id);
        return ResponseEntity.ok(mov);
    }
    @GetMapping("/movies/set-available/{id}")
    public ResponseEntity<Movie> setAvailable(@PathVariable Integer id){
        return ResponseEntity.ok(moviesService.setAvailableToTrue(id));
    }
    @GetMapping("/movies/set-unavailable/{id}")
    public ResponseEntity<Movie> setUnavailable(@PathVariable Integer id){
        return ResponseEntity.ok(moviesService.setAvailableToFalse(id));
    }
    @PostMapping("/movies")
    @ResponseBody
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(moviesService.createMovie(movie));
    }
    @PutMapping("/movies/{id}")
    @ResponseBody
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(moviesService.updateMovie(movie));
    }
    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Integer id){
        moviesService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}
