package org.example.moviesincityservice.repository;

import org.example.moviesincityservice.entity.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    Cinema findByCityName(String cityName);
}
