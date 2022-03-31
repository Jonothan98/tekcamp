USE sakila;
SELECT staff_id,first_name,last_name FROM staff
 	INNER JOIN address on staff.address_id = address.address_id
	INNER JOIN city on address.city_id = city.city_id
	WHERE city.city = 'Lethbridge'
;
