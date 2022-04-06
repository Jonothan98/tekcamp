package com.teksystems.bootcamp.springboot.movierental.Rating;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating", schema = "sakila")
public class Rating {


    @Id
    @Column(name = "rating_id", columnDefinition = "SMALLINT(3) UNSIGNED")
    @Getter @Setter
    private short rating_id;

    @Getter @Setter @Column
    private int rating_score;

    @Getter @Setter
    private String description;

}
