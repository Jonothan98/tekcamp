USE sakila;
SELECT store_id,film_id,COUNT(*) AS 'Number of Copies' FROM inventory GROUP BY film_id, store_id;