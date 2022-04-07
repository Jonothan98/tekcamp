package com.teksystems.bootcamp.springboot.movierental;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
public class Customer {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "customer_id", columnDefinition = "SMALLINT(3) UNSIGNED default '40'")
        @Getter @Setter
        private short customer_id;


}
