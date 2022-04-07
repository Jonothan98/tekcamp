package com.teksystems.bootcamp.springboot.movierental.Rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class RatingController {

    @Autowired
    private RatingRepository ratingRepository;

    @GetMapping("api/ratings")
    public Page<Rating> getAllRatings(){
        return ratingRepository.findAll(Pageable.ofSize(25));
    }

    @GetMapping("api/ratings/{id}")
    public Optional<Rating> getRatingsById(@PathVariable short id){
        return ratingRepository.findById(id);
    }

    @PostMapping("/api/ratings")
    public Rating createRatings(@Valid @RequestBody Rating rating){

        return ratingRepository.save(rating);
    }

    @PutMapping("/api/ratings/{id}")
    public ResponseEntity<Object> updateRating(@Valid @RequestBody Rating rating, @PathVariable short id){
        Optional<Rating> ratingOptional = ratingRepository.findById(id);

        if(!ratingOptional.isPresent())
            return ResponseEntity.notFound().build();

        rating.setRating_id(id);
        ratingRepository.save(rating);
        return ResponseEntity.noContent().build();

    }


    @DeleteMapping("api/ratings/{id}")
    public void deleteRating(@PathVariable short id){
        ratingRepository.deleteById(id);
    }

}
