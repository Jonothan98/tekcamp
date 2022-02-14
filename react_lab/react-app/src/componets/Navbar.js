import react from "react";
import { Link } from "react-router-dom";
import './style.css';

function Navbar(){
    return(
        <div className="navContainer">
            <Link to="/" className="navLinks">Super Social</Link>
            <Link to ="/profile" className="navLinks">Profile</Link>
        </div>
    );
}

export default Navbar;