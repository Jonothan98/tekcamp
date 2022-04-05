package com.teksystems.bootcamp.springboot.movierental.film;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "film", schema = "sakila")
public class Film {

    @Id
    @GeneratedValue
    private int film_id;
    @Getter @Setter
    private String title;
}
