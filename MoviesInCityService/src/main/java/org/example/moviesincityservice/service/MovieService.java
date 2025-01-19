package org.example.moviesincityservice.service;

import lombok.RequiredArgsConstructor;
import org.example.moviesincityservice.entity.model.Movie;
import org.example.moviesincityservice.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> getMoviesByCityName(String cityName) {
        return movieRepository.findMovieByCinemaCityName(cityName);
    }
}
