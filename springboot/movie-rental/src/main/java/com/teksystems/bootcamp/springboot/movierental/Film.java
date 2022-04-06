package com.teksystems.bootcamp.springboot.movierental;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "film", schema = "sakila")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", columnDefinition = "SMALLINT(5) UNSIGNED")
    @Getter @Setter
    private short film_id;
}
