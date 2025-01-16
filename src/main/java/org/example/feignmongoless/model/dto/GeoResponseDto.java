package org.example.feignmongoless.model.dto;

import lombok.Data;

@Data
public class GeoResponseDto {

    private String ip;

    private City city;

    private Region region;

    private Country country;

    @Data
    static class City {

        private String name_ru;
    }

    @Data
    static class Region {

        private String name_ru;
    }

    @Data
    static class Country {

        private String name_ru;
    }
}
