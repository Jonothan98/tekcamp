use Sakila;
SELECT 
    customer.first_name,
    customer.last_name, 
    DATE(rental_date) AS 'Rental Date',
    COUNT(DATE(rental_date)) AS 'Number of Rentals',
    SUM(payment.amount) AS 'Total Amount Payed That DAY'
    FROM rental
	INNER JOIN customer ON rental.customer_id = customer.customer_id
    INNER JOIN payment ON rental.rental_id = payment.rental_id
	GROUP BY customer.customer_id, DATE(rental_date)
    HAVING COUNT(DATE(rental_date)) > 1
;