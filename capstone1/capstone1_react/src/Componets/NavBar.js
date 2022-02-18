import React from "react";
import { Link } from "react-router-dom";
import './Styles/navBar.css'

function NavBar(){
    return(
        <div className="navContainer">
            <Link to="/" className="link">Home Page</Link>
            <input placeholder="Search"></input>
            <Link to="/cart" className="cartLink">Cart</Link>
        </div>
    );
}

export default NavBar;