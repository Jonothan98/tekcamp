package com.teksystems.bootcamp.springboot.movierental.Review;

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
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/api/review")
    public Page<Review> getAllReviews(){
        return reviewRepository.findAll(Pageable.ofSize(25));
    }

    @GetMapping("/api/review/{id}")
    public Optional<Review> getReviewById(@PathVariable Long id){
        return reviewRepository.findById(id);
    }

    @PostMapping("/api/review")
    public ResponseEntity<Object> createReview(@Valid@RequestBody Review review){
        Review savedReview = reviewRepository.save(review);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedReview.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/api/review/{id}")
    public ResponseEntity<Object> updateReview(@Valid @RequestBody Review review, @PathVariable Long id){
        Optional<Review> reviewOptional = reviewRepository.findById(id);

        if(!reviewOptional.isPresent())
            return ResponseEntity.notFound().build();

        review.setId(id);
        reviewRepository.save(review);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("api/review/{id}")
    public void deleteReview(@PathVariable long id){
        reviewRepository.deleteById(id);
    }
}
