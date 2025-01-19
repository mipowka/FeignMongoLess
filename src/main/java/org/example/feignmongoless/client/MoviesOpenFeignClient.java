package org.example.feignmongoless.client;

import org.example.feignmongoless.model.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "movie-client",url = "localhost:8082/movies")
public interface MoviesOpenFeignClient {

    @GetMapping
    List<MovieDto> getMoviesByCity(@RequestParam String city);
}
