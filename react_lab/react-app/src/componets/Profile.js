import react from "react";
import './style.css';

function Profile(){
    return(
        <div className="profileContainer">
            <img src="/" alt="avatar"/>
            <h2>Jonothan Castillo</h2>
            <h2>gender: Male</h2>
            <h2>July 12, 1998</h2>
            <h2>1234 Sesame street</h2>
        </div>
    );
}

export default Profile;