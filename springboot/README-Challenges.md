Challenges

1. The biggest challenge was the Review controller and servicer. For some reason I could not get it to work. Even with the help of Rami, Alan, and Joey. For some reason anytime you try to do PUT or POST it has an error. When I stopped working on it the error it was giving me was that store_id is not defined a default value. I am not geting store_id at all, and it is assigned a default value in the Schema, so I don't know why that was happening. 

2. The setting up of Customer, Film, and Rating entity was easy, but when it came to combinding them in review was the road block.

Sources
1. The udemy was a big help (https://teksystems.udemy.com/course/spring-web-services-tutorial/learn/lecture/9765290#overview) & (https://teksystems.udemy.com/course/hibernate-jpa-tutorial-for-beginners-in-100-steps/learn/lecture/7907458#overview)
2. These two videos helped me with getting started in spring boot (https://www.youtube.com/watch?v=th3uIP7D8nk) & (https://www.youtube.com/watch?v=9SGDpanrc8U&t=4402s)
3. This last source helped me with the creating of the CRUD commands (https://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate)

Steps
1. When you start make sure to enter your own password in the application.properties
2. When posting to rating in swagger don't include the rating_id.
3. When posting to review you will get a 400 error. To get the same 500 error I was getting input like so ("rating_id":1,"film_id":1,"customer_id":1). This should give you a 500 error in swagger and a store_id error in intelliJ (Still don't know why).