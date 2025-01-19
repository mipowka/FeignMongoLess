package org.example.feignmongoless.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.example.feignmongoless.client.MoviesOpenFeignClient;
import org.example.feignmongoless.client.SypexGeoOpenFeignClient;
import org.example.feignmongoless.model.dto.GeoResponseDto;
import org.example.feignmongoless.model.dto.MovieDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ControllerDon {

    private final SypexGeoOpenFeignClient sypexGeoOpenFeignClient;
    private final MoviesOpenFeignClient moviesOpenFeignClient;

    @GetMapping
    public ResponseEntity<List<MovieDto>> getMoviesByCity(HttpServletRequest request) {
        String clientIp = request.getRemoteAddr();
//        GeoResponseDto geolocation = sypexGeoOpenFeignClient.getGeolocation("178.57.108.71");
        GeoResponseDto geolocation = sypexGeoOpenFeignClient.getGeolocation("93.90.94.232");
//        GeoResponseDto geolocation = sypexGeoOpenFeignClient.getGeolocation(clientIp);
        String geoCity = geolocation.getCity().getName_ru();
        List<MovieDto> moviesByCity = moviesOpenFeignClient.getMoviesByCity(geoCity);

        return ResponseEntity.ok(moviesByCity);
    }
}
