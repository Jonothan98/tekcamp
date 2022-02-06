const faqList = document.querySelector("#faq-list")

faqList.addEventListener('click', onClick);

function onClick(itemClicked){

    if(itemClicked.target.parentElement.classList.contains("faq-item") && itemClicked.target.classList.contains("question")){
        toggleDropBox(itemClicked.target.parentElement.lastElementChild,itemClicked.target.firstElementChild, itemClicked.target);

    } else if(itemClicked.target.parentElement.parentElement.classList.contains("faq-item") && itemClicked.target.classList.contains("arrow-icon")){
        toggleDropBox(itemClicked.target.parentElement.parentElement.lastElementChild, itemClicked.target, itemClicked.target.parentElement);

    }
    
}

function toggleDropBox(textToggle, imageToggle, boldToggle){

    if(textToggle.style.display === "block"){
        textToggle.style.display = "none";
        imageToggle.style.transform = "rotate(0deg)";
        boldToggle.style.fontWeight = 'normal';

    } else {
        textToggle.style.display = "block";
        imageToggle.style.transform = "rotate(90deg)";
        boldToggle.style.fontWeight = 'bold';
    }
}