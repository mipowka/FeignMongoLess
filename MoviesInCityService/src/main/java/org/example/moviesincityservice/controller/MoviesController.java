package org.example.moviesincityservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.moviesincityservice.entity.model.Movie;
import org.example.moviesincityservice.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MoviesController {

    private final MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies(@RequestParam String city) {
        return ResponseEntity.ok(movieService.getMoviesByCityName(city));
    }
}
