USE sakila;
SELECT first_name, last_name FROM customer
	WHERE 
    (first_name LIKE '%j%' 
    OR first_name LIKE '%c%')
    AND 
    (last_name LIKE '%c%'
    OR last_name LIKE '%j%')

    