package com.teksystems.bootcamp.springboot.movierental.customer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer", schema = "sakila")
public class Customer {


        @Id
        @GeneratedValue
        private int customer_id;
        @Getter @Setter
        private int store_id;
        @Getter @Setter
        private String first_name;
        @Getter @Setter
        private String last_name;

    public Customer() {
    }

    public Customer(Integer customer_id, Integer store_id, String first_name, String last_name) {
        this.customer_id = customer_id;
        this.store_id = store_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", store_id=" + store_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
