package com.example.daviddiazpractica2.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Critica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String autor;

    private String texto;

    private double puntuacion;

    @ManyToOne
    private Pelicula pelicula;


}
