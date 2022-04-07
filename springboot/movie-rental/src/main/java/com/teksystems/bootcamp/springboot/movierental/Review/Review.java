package com.teksystems.bootcamp.springboot.movierental.Review;

import com.teksystems.bootcamp.springboot.movierental.Customer;
import com.teksystems.bootcamp.springboot.movierental.Film;
import com.teksystems.bootcamp.springboot.movierental.Rating.Rating;

import javax.persistence.*;

@Entity
@Table(name = "review", schema = "sakila")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long review_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rating_id")
    private Rating rating = new Rating();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id")
    private Film film = new Film();

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer = new Customer();

    public Review(){

    }

    public Review(short rating, short film, short customer) {
        this.rating.setRating_id(rating);
        this.film.setFilm_id(film);
        this.customer.setCustomer_id(customer);
    }

    public Review(Rating rating, Film film, Customer customer) {
        this.rating = rating;
        this.film = film;
        this.customer = customer;
    }

    public short getRating() {
        return rating.getRating_id();
    }

    public short getFilm() {
        return film.getFilm_id();
    }

    public short getCustomer() {
        return customer.getCustomer_id();
    }

    public Long getId() {
        return review_id;
    }

    public void setId(Long id) {
        this.review_id = id;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
