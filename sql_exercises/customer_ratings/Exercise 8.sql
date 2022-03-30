USE sakila;
CREATE TABLE customerRatings(
	rating_id INT AUTO_INCREMENT,
    film_id SMALLINT UNSIGNED NOT NULL,
    rating INT,
    FOREIGN KEY (film_id) REFERENCES film(film_id),
    PRIMARY KEY(rating_id)
);
INSERT INTO customerRatings(film_id,rating)
VALUES(1,16),
(2,45),
(3,55),
(4,100),
(1,42),
(2,78),
(3,45),
(4,12),
(1,89),
(2,56),
(3,23),
(4,85),
(1,74),
(2,96),
(3,41),
(4,52),
(1,63),
(2,14),
(3,25),
(4,36)
;

SELECT film_id, MAX(rating) AS 'Highest Rating', MIN(rating) AS 'Lowest Rating', ROUND(AVG(rating),2) AS 'Average Score', COUNT(rating) AS 'Number of Reviews'  FROM customerRatings
	GROUP BY film_ID
;