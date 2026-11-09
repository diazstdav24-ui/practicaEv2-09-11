package com.example.daviddiazpractica2.Repositories;

import com.example.daviddiazpractica2.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
