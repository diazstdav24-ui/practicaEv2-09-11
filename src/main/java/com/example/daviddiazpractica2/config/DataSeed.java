package com.example.daviddiazpractica2.config;

import com.example.daviddiazpractica2.Repositories.CriticaRepository;
import com.example.daviddiazpractica2.Repositories.GeneroRepository;
import com.example.daviddiazpractica2.Repositories.PeliculaRepository;
import com.example.daviddiazpractica2.models.Critica;
import com.example.daviddiazpractica2.models.Genero;
import com.example.daviddiazpractica2.models.Pelicula;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final PeliculaRepository peliRepo;
    private final CriticaRepository criticaRepository;
    private final GeneroRepository generoRepository;

    @PostConstruct
    public void cargarDatos(){


        Critica critica1 = Critica.builder()
                                    .autor("Davi")
                                    .puntuacion(10)
                                    .texto("MuyBuena")
                                    .build();



        Critica critica2 = Critica.builder()
                                    .autor("Davi")
                                    .puntuacion(10)
                                    .texto("MuyBuena")
                                    .build();

        Critica critica3 = Critica.builder()
                .autor("Davi")
                .puntuacion(10)
                .texto("MuyBuena")
                .build();


        Genero genero1 = Genero.builder()
                                .nombre("Drama")
                               .build();

        Genero genero2 = Genero.builder()
                                .nombre("Terror")
                                .build();

        Pelicula pelicula = Pelicula.builder()
                                    .titulo("L'haine")
                                    .anioEstreno(2005)
                                    .build();

        Pelicula pelicula2 = Pelicula.builder()
                .titulo("Psicosis")
                .anioEstreno(1978)
                .build();


        pelicula.addCritica(critica1);
        pelicula.addCritica(critica2);
        pelicula2.addCritica(critica3);

        pelicula.setGeneros(Set.of(genero1));
        pelicula2.setGeneros(Set.of(genero1,genero2));

        peliRepo.save(pelicula);
        peliRepo.save(pelicula2);

        criticaRepository.save(critica1);

        criticaRepository.save(critica2);

        criticaRepository.save(critica3);

        generoRepository.save(genero1);
        generoRepository.save(genero2)



    }


}
