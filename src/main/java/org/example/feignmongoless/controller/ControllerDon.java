package org.example.feignmongoless.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.example.feignmongoless.client.SypexGeoOpenFeignClient;
import org.example.feignmongoless.model.dto.GeoResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerDon {

    private final SypexGeoOpenFeignClient sypexGeoOpenFeignClient;

    @GetMapping
    public ResponseEntity<GeoResponseDto> hello(HttpServletRequest request) {
        String clientIp = request.getRemoteAddr();
        GeoResponseDto geolocation = sypexGeoOpenFeignClient.getGeolocation("93.90.94.232");
        return ResponseEntity.ok(geolocation);
    }
}
