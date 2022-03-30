USE sakila;
SELECT rental_id,rental_date, inventory_id, customer_id, return_date, staff_id, last_update, REPLACE(rental_date,rental_date,DATE(rental_date)) AS 'Rental Date Without Time' FROM rental
 	WHERE TIME(rental_date) < TIME(100000)
    ORDER BY rental_id DESC
 	LIMIT 10
;