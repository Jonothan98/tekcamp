import React, { useState } from "react";
import { Link } from "react-router-dom";
import './Styles/navBar.css'

function NavBar({ data, cartItems, isStaff, logOut }) {

    const [foundItem, setFoundItem] = useState([]);
    const [itemFound, setItemFound] = useState(false);


    function searching(inputValue) {

        const filterData = data.filter((item) => {
            const userInput = inputValue.toLowerCase();

            return (
                item.name.toLowerCase().includes(userInput) ||
                item.manufacturer.toLowerCase().includes(userInput) ||
                item.tags.toLowerCase().includes(userInput) ||
                item.price.toString().includes(userInput) ||
                item.serialNumber.toString().includes(userInput)
            )
        })

        if (inputValue === "") {
            setFoundItem([]);
            setItemFound(false);
        } else if(inputValue !== "" && filterData.length === 0){
            setFoundItem([]);
            setItemFound(true);
        }else {
            setFoundItem(filterData);
        }
        
    }


    return (
        <div className="navContainer">
            <div className="homeLinkContiner">
                <Link to="/" className="homepageLink">Home Page</Link>
            </div>
            <div className="cartLinkContainer">
                {isStaff && (
                    <div className="logBut">
                        <Link to="/staff" className="logLink">Staff Page</Link>
                        <button className="logOutBut" onClick={() => logOut()}>Log Out</button>
                    </div>
                )}
                {!isStaff && (
                    <div>
                        <Link to="/login" className="logLink">Login</Link>
                    </div>
                )}
                <Link to="/cart" className="cartLink">Cart: {cartItems.length}</Link>
            </div>
            <div className="middleContainer">
                <div className="searchContainer">
                    <div className="inputContainer">
                        <input className="searchInput" placeholder="Search Item" onChange={(e) => { searching(e.target.value) }}></input>
                    </div>
                    {foundItem.length !== 0 && (
                        <div>
                            {foundItem.map((item, id) => {
                                return (
                                    <div className="resultsContainer" key={id}>
                                        <Link to={`/product/${item.serialNumber}`} className="results" >{item.name}</Link>
                                    </div>
                                )
                            })}
                        </div>
                    )}
                    {itemFound === true && foundItem.length === 0 && (
                            <div className="resultsContainer">
                                <p className="resutls">Item not found</p>
                            </div>
                        
                    )}
                </div>
            </div>
        </div>
    );
}

export default NavBar;