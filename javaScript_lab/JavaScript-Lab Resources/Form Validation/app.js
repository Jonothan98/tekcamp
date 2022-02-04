const inputList = document.getElementsByTagName("input");
const errorText = document.getElementsByClassName("error-text");
const errorExclamation = document.getElementsByClassName("input-error");
const email = document.getElementById("email");
const emailError = document.getElementById("email-error");

//Regex formula provided by: https://www.w3resource.com/javascript/form/email-validation.php
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

document.querySelector('#form-submit').addEventListener('click', onClick)

//OnClick funtion checks if inputs are empty then checks if email was submitted correctly
function onClick(){

    for(let i = 0; i < inputList.length; i++){

        if(inputList[i].value == '' ){
            errorText[i].style.visibility = 'visible';
            errorExclamation[i].style.visibility = 'visible';
            inputList[i].placeholder = "";
            inputList[i].classList.add("error");
        } 
        else{
            errorText[i].style.visibility = 'hidden';
            errorExclamation[i].style.visibility = 'hidden';
            inputList[i].classList.remove("error");
        }
    
    }

    if(email.value !== "" && email.value.match(mailformat) == null){ 
        emailError.innerText = "Looks like this is not an email";
        emailError.style.visibility = 'visible';
        document.querySelector("#email").previousElementSibling.style.visibility = 'visible';
        document.querySelector("#email").classList.add("error");
        document.querySelector("#email").classList.add("invalid-email");
    
    } else if(email.value.match(mailformat) !== null){
        emailError.innerText = "";
        emailError.style.visibility = 'hidden';
        document.querySelector("#email").previousElementSibling.style.visibility = 'hidden';
        document.querySelector("#email").classList.remove("error");
        document.querySelector("#email").classList.remove("invalid-email");
    }

}