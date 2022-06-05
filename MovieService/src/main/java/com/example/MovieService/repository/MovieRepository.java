package com.example.MovieService.repository;

import com.example.MovieService.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
