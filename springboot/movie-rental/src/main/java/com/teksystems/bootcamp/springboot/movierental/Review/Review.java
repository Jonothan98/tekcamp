package com.teksystems.bootcamp.springboot.movierental.Review;

import com.teksystems.bootcamp.springboot.movierental.Customer;
import com.teksystems.bootcamp.springboot.movierental.Film;
import com.teksystems.bootcamp.springboot.movierental.Rating.Rating;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Review")
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rating_id")
    private Rating rating;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id")
    private Film film;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

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
        return id;
    }
}
