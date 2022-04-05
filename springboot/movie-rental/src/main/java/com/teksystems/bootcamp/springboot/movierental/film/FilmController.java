package com.teksystems.bootcamp.springboot.movierental.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;

    @GetMapping("/api/films")
    public Page<Film> getAllFilms(){
        return filmRepository.findAll(Pageable.ofSize(25));
    }

    @GetMapping("/api/film/{id}")
    public Optional<Film> getFilmById(@PathVariable int id){
        return filmRepository.findById(id);
    }

    @DeleteMapping("/api/film/{id}")
    public void deleteFilm(@PathVariable int id){
        filmRepository.deleteById(id);
    }

    @PostMapping("/api/films")
    public ResponseEntity<Object> createFilm(@Valid @RequestBody Film film){
        Film savedFilm = filmRepository.save(film);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedFilm.getFilm_id()).toUri();

        return ResponseEntity.created(location).build();
    }
}
