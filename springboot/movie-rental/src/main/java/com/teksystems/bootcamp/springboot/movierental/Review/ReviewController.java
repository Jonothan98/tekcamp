package com.teksystems.bootcamp.springboot.movierental.Review;

import com.teksystems.bootcamp.springboot.movierental.Customer;
import com.teksystems.bootcamp.springboot.movierental.Film;
import com.teksystems.bootcamp.springboot.movierental.Rating.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewServicer reviewServicer;

    @Autowired
    ReviewRepository reviewRepository;

    public ReviewController(ReviewServicer reviewServicer) {
        this.reviewServicer = reviewServicer;
    }

    @GetMapping
    public Page<Review> index(){
        return reviewServicer.getAllReviews();
    }

//    @PostMapping("/createReview")
//    public Review createReview(@RequestParam(value = "film_id") short film, @RequestParam(value = "customer_id") short customer, @RequestParam(value = "rating_id") short rating){
//        Review review = new Review(rating,film,customer);
//        return reviewServicer.createReview(review);
//    }

    @PostMapping("/createReview")
    public Review createReview(@RequestBody Review review){
//        Review review = new Review(rating,film,customer);
        return reviewServicer.createReview(review);
    }


    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable("id") Long id){
        return reviewServicer.getReviewById(id);
    }

    @PutMapping("/updateReview")
    public Review updateReview(@PathVariable("id") Long id, @RequestBody Film film, Customer customer, Rating rating){
        Review review = reviewServicer.updateReview(id,rating,film,customer);
        return review;
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void deleteReview(@PathVariable("id") Long id){
        reviewServicer.deleteReview(id);
    }

}
