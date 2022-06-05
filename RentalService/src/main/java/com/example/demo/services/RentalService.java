package com.example.demo.services;

import com.example.demo.models.Movie;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {
    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Movie getMovie(Integer id){
        return restTemplate.getForObject("http://localhost:8080/movies/" + id, Movie.class);
    }

    public Movie returnMovie(Integer id){
        return restTemplate.getForObject("http://localhost:8080/movies/set-available/" + id, Movie.class);
    }

    public Movie rentMovie(Integer id){

        return restTemplate.getForObject("http://localhost:8080/movies/set-unavailable/" + id, Movie.class);

    }

}
