import React, { useState } from "react";
import { Link } from "react-router-dom";
import './Styles/navBar.css'

function NavBar({ data, cartItems, isStaff, logOut }) {

    const [foundItem, setFoundItem] = useState([]);


    function searching(inputValue) {

        if (isNaN(inputValue)) {
            let filterData = data.filter((item) => {
                return item.name.toLowerCase().includes(inputValue.toLowerCase());
            })

            filterData = data.filter((item) => {
                return item.manufacturer.toLowerCase().includes(inputValue.toLowerCase());
            })

            filterData = data.filter((item) => {
                return item.tags.toLowerCase().includes(inputValue.toLowerCase());
            })

            if (inputValue === "") {
                setFoundItem([])
            } else {
                setFoundItem(filterData);
            }

        } else {

            let filterData = data.filter((item) => {
                return item.price.toString().includes(inputValue);
            })

            filterData = data.filter((item) => {
                return item.serialNumber.toString().includes(inputValue);
            })

            if (inputValue === "") {
                setFoundItem([])
            } else {
                setFoundItem(filterData);
            }

        }

    }


    return (
        <div className="navContainer">
            <div className="homeLinkContiner">
                <Link to="/" className="link">Home Page</Link>
            </div>
            <div className="middleContainer">
                <div className="searchContainer">
                    <div className="inputContainer">
                        <input placeholder="Search" onChange={(e) => { searching(e.target.value) }}></input>
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
                </div>
            </div>
            <div className="cartLinkContainer">
                {isStaff && (
                    <div>
                        <Link to="/staff">Staff Page</Link>
                        <button onClick={() => logOut()}>Log Out</button>
                    </div>
                )}
                {!isStaff && (
                    <div>
                        <Link to="/login">Login</Link>
                    </div>
                )}
                <Link to="/cart" className="cartLink">Cart: {cartItems.length}</Link>
            </div>
        </div>
    );
}

export default NavBar;