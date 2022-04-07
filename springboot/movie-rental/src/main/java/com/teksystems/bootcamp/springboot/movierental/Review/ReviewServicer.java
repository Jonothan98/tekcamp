package com.teksystems.bootcamp.springboot.movierental.Review;

import com.teksystems.bootcamp.springboot.movierental.Customer;
import com.teksystems.bootcamp.springboot.movierental.Film;
import com.teksystems.bootcamp.springboot.movierental.Rating.Rating;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewServicer {

    private final ReviewRepository reviewRepository;

    public ReviewServicer(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Page<Review> getAllReviews(){
        return reviewRepository.findAll(Pageable.ofSize(25));
    }

    public Review createReview(Review review){
        return reviewRepository.save(review);
    }

    public Review getReviewById(Long id){
        Optional<Review> reviewOptional = reviewRepository.findById(id);

        return reviewOptional.orElse(null);
    }

    public Review updateReview(Long id, Rating rating, Film film, Customer customer){
        Optional<Review> reviewOptional = reviewRepository.findById(id);

        if(reviewOptional.isPresent()){
            Review updateReview = reviewOptional.get();
            updateReview.setFilm(film);
            updateReview.setRating(rating);
            updateReview.setCustomer(customer);
            return reviewRepository.save(updateReview);
        }else{
            return null;
        }
    }

    public void deleteReview(Long id){
        reviewRepository.deleteById(id);
    }
}
