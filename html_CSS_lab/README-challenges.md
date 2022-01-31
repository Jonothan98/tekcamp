------ Sources ----------
The source I used the most for this assignment was the Udemy tutorial, w3schools tutorials (https://www.w3schools.com/css/default.asp), and the lecture materials.

----- Challenges -----
The biggest challenge I had was with the "learn more" buttons in CSS. I could not for the life of me figure out how to get it at the bottom of the box and have it still look good for both mobile and desktop. Following the flexbox lecture, I was able to get closer to the solution. From the lecture and udemy source, I figured out what my problem was. I was calling the parent of the button like this (.flex-container #btn-sedan) then adding the flex commands but it would just apply the flex directly to the buttons stretching them out. My Solution to this was to make a parent <span> and nest the <button> in it, then apply the flex commands to span moving the button to the correct spot inside of <span>.

Another challenge I had was in HTML. Mainly there were multiple instances where I was working in CSS and had to go back to HTML because either I got the priority levels wrong or I could name things in a way that would make my CSS code easier to read and more optimal. (An example of this was I mixed up the priorities I had with <section> and <button>. I had an id on <section> and a class on <button>, but now I know better.)

----- Outro -----
After reviewing my code and you see any major ways that I could have simplified what I have written or have made things easier please let me know. (Also I hope I am structuring this okay, let me know if there is a specific way you want the README to be structured). 