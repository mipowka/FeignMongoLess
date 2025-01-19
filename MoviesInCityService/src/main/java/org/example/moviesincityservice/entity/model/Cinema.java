package org.example.moviesincityservice.entity.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cinemas")
@Data
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cityName;

    @OneToMany(mappedBy = "cinema")
    private List<Movie> movies = new ArrayList<>();
}
