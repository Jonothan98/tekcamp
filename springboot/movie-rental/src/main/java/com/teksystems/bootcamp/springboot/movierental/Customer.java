package com.teksystems.bootcamp.springboot.movierental;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "customer", schema = "sakila")
public class Customer {


        @Id
        @GeneratedValue
        @Column(name = "customer_id", columnDefinition = "SMALLINT(5) UNSIGNED")
        @Getter @Setter
        private short customer_id;

}
