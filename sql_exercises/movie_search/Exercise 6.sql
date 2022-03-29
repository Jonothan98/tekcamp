USE sakila;
SELECT * FROM film
	WHERE title LIKE '%a%b%c%'
    AND
	length>120
;