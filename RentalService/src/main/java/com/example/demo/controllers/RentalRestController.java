package com.example.demo.controllers;

import com.example.demo.models.Movie;
import com.example.demo.services.RentalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RentalRestController {

    private final RentalService rentalService;

    public RentalRestController(RentalService rentalService) {
        this.rentalService = rentalService;
    }


    @GetMapping("/get-movie")
    public ResponseEntity<Movie> getMovie(@RequestParam Integer id){
        return ResponseEntity.ok(rentalService.getMovie(id));
    }

    @GetMapping("/return-movie")
    public ResponseEntity<Movie> returnMovie(@RequestParam Integer id){
        return ResponseEntity.ok(rentalService.returnMovie(id));
    }

    @GetMapping("/rent-movie")
    public ResponseEntity<Movie> rentMovie(@RequestParam Integer id){
        return ResponseEntity.ok(rentalService.rentMovie(id));
    }
}
