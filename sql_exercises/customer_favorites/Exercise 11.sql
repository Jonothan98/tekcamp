USE sakila;
SELECT * FROM
	(SELECT 
        customer.first_name,
		customer.last_name,
		category.name,
        ROW_NUMBER() OVER(PARTITION BY customer.customer_id ORDER BY rental.rental_date DESC) AS row_num,
        ROW_NUMBER() OVER(PARTITION BY customer.customer_id,category.name ORDER BY customer.customer_id) AS row_num_two
    FROM customer
    INNER JOIN rental ON customer.customer_id = rental.customer_id
    INNER JOIN inventory ON rental.inventory_id = inventory.inventory_id
    INNER JOIN film_category ON inventory.film_id = film_category.film_id
    INNER JOIN category ON film_category.category_id = category.category_id
    WHERE CONCAT(customer.first_name,customer.last_name) LIKE '%j%'
    OR CONCAT(customer.first_name,customer.last_name) LIKE '%c%'
    GROUP BY customer.last_name,customer.first_name, rental.rental_date
    ORDER BY customer.last_name, row_num_two DESC
    
    ) AS t
    WHERE row_num <= 10
    ;