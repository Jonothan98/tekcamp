//const faqItem = document.getElementsByClassName("faq-item");
const answer = document.getElementsByClassName("answer");

document.querySelector(".faq-item").addEventListener('click', onClick);

function onClick(clickedItem){

    let clickHolder = clickedItem.target.className;

    console.log(clickHolder);
    if(clickHolder == "question"){
        console.log("gets here");
        document.querySelector(".answer").style.display = "block";
    }
}