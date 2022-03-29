USE sakila;
SELECT *,REPLACE(rental_date,rental_date,SUBSTRING(rental_date, 1, 10)) AS 'Rental Date Without Time' FROM rental
	WHERE SUBSTRING(rental_date,12,13) < 10
    LIMIT 10
;