USE sakila;
CREATE TABLE rating(
	rating_id INT PRIMARY KEY AUTO_INCREMENT,
 	number_of_stars INT UNIQUE,
 	stars_description VARCHAR(100)
);

INSERT INTO rating(number_of_stars, stars_description)
VALUES(1,'The movie was pretty bad'),
(2,'The movie was pretty bad but not as bad'),
(3,'The movie was bad'),
(4,'The movie is getting into meh territory'),
(5,'The movie is meh');
SELECT * FROM rating;
