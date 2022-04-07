package com.teksystems.bootcamp.springboot.movierental.Rating;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rating", schema = "sakila")
public class Rating {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id", columnDefinition = "SMALLINT(5) UNSIGNED")
    @Getter @Setter
    private short rating_id;

    @Getter @Setter @Column
    private int rating_score;

    @Getter @Setter
    private String description;

}
