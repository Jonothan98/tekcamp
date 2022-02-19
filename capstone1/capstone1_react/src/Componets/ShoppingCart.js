import React from "react";
import "./Styles/shoppingCart.css"

function ShoppingCart({ cartItems }) {

    let totalPrice = 0;

    cartItems.forEach(element => {
        totalPrice += element.price * element.qty;
    });
    console.log(totalPrice.toFixed(2));

    return (
        <div>
            <div>
                {cartItems.map((cartItems) => {
                    return (
                        <div key={cartItems.serialNumber} className="cartContainer">
                            <div className="cartImgContainer">
                                <img className="cartImage" src={cartItems.image} />
                            </div>
                            <div className="cartTextContainer">
                                <p>{cartItems.name}</p>
                                <p>Price: ${cartItems.price}</p>
                                <p>Quantity Selected: {cartItems.qty}</p>
                            </div>

                        </div>
                    );
                })}
            </div>
            <div className="totalContainer">
                <div className="totalTitle">
                    <h1>Current Cart Total</h1>
                </div>
                {cartItems.map((cartItems) => {
                    return(
                        <div key={cartItems.serialNumber} className="totalTextContainer">
                            <p>{cartItems.name} - Quantity: {cartItems.qty} * ${cartItems.price.toFixed(2)}</p>
                        </div>
                    );
                })}
                <div className="finalTotal"> 
                    <p>Totals: ${totalPrice.toFixed(2)}</p>
                </div>
            </div>
        </div>
    );
}

export default ShoppingCart;

{/* <div className="totalContainer">
                            <div className="totalTitle">
                                <h1>Current Cart</h1>
                            </div>
                        </div> */}