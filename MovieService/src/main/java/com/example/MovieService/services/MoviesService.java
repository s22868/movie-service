package com.example.MovieService.services;

import com.example.MovieService.movie.Movie;
import com.example.MovieService.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    private final MovieRepository movieRepository;


    public MoviesService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovie(Integer id) {
        return movieRepository.findById(id).get();
    }

    public Movie createMovie(Movie movie) {
        return new Movie(movie.getId(), movie.getNazwa(), movie.getKategoria(), movie.isAvailable());
    }

    public Movie updateMovie(Movie movie) {
        Movie update = movieRepository.getById(movie.getId());

        return movieRepository.save(update);
    }

    public Movie setAvailableToTrue(Integer id){
        Movie movie = movieRepository.getById(id);
        movie.setAvailable(true);
        return movieRepository.save(movie);
    }

    public Movie setAvailableToFalse(Integer id){
        Movie movie = movieRepository.getById(id);
        movie.setAvailable(false);
        return movieRepository.save(movie);
    }

    public Movie fillDatabase(){
        return movieRepository.save(new Movie(null, "Test", "test", true));
    }

    public void deleteMovie(Integer id) {
        movieRepository.deleteById(id);
    }
}
