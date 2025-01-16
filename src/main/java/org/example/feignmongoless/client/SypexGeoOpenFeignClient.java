package org.example.feignmongoless.client;

import org.example.feignmongoless.model.dto.GeoResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "sypexgeo-client", url = "https://api.sypexgeo.net/json/")
public interface SypexGeoOpenFeignClient {

    @GetMapping("{ip}")
    GeoResponseDto getGeolocation(@PathVariable String ip);
}
