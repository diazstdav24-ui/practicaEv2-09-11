package com.example.daviddiazpractica2.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private  String titulo;

    //Utilizo int, porque no recuerdo como se era la sintaxis para crear un fecha
    private int anioEstreno;

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL)
    private Set <Critica> criticas = new HashSet<>();

    //No estoy muy seguro, pero creo que no tengo que poner nada aqui para el borrad
    //Ya que como la relacion no es bidireccional, si borro un genero la otra entidad no se entera de nada
    @ManyToMany()
    private Set<Genero> generos = new HashSet<>();


    public void addCritica(Critica critica){

    criticas.add(critica);
    critica.setPelicula(this);

    }

    public void removeCritica(Critica critica){

        criticas.remove(critica);
        critica.setPelicula(this);

    }
}
