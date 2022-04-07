package com.teksystems.bootcamp.springboot.movierental;


import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "film", schema = "sakila")
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", columnDefinition = "SMALLINT(3) UNSIGNED default '40'")
    @Getter @Setter
    private short film_id;
}
