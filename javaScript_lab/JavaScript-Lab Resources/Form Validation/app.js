const inputList = document.getElementsByTagName("input");
const errorText = document.getElementsByClassName("error-text");
const errorExclamation = document.getElementsByClassName("input-error");
const emailPlaceholder = document.getElementById("email");
const emailError = document.getElementById("email-error");

//Regex formula provided by: https://www.w3resource.com/javascript/form/email-validation.php
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

document.querySelector('#form-submit').addEventListener('click', onClick)

function onClick(){

    for(let i = 0; i < inputList.length; i++){

        if(inputList[i].value != '' && i != 2 ){
            errorText[i].style.visibility = 'hidden';
            errorExclamation[i].style.visibility = 'hidden';
        } 
        else{
            errorText[i].style.visibility = 'visible';
            errorExclamation[i].style.visibility = 'visible';
        }

        if(i == 2 && inputList[i].value.toString().match(mailformat)){
            errorText[i].style.visibility = 'hidden';
            errorExclamation[i].style.visibility = 'hidden';

        }
        else if( i == 2 && inputList[i].value != '' ){
            emailPlaceholder.placeholder = "email@example/com";
            emailError.innerText = "Looks like this is not an email";
            errorText[i].style.visibility = 'visible';
            errorExclamation[i].style.visibility = 'visible';
            inputList[i].value = '';
        }
        

    }
}