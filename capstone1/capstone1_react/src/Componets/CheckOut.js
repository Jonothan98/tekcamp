import React from "react";
import './Styles/shoppingCart.css';
import './Styles/checkOut.css';

function CheckOut({data, updateQuantity}) {

    let totalPrice = 0;

    data.forEach(element => {
        totalPrice += element.price * element.qty;
    });

    return (
        <div>
            <div className="totalContainer">
                <div className="totalTitle">
                    <h1>Current Cart Total</h1>
                </div>
                {data.map((cartItems) => {
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
            <div className="checkoutContainer">
                <div className="billInfo">
                    <label htmlFor="name">Name</label>
                    <input type="text" id="name" />
                    <label htmlFor="email">Email</label>
                    <input type="text" id="email" />
                    <label htmlFor="address">Address</label>
                    <input type="text" id="address" />
                    <label htmlFor="city">City</label>
                    <input type="text" id="city" />
                    <label htmlFor="state">State</label>
                    <input type="text" id="state" />
                    <label htmlFor="zip">Zip</label>
                    <input type="text" id="zip" />
                </div>
                <div className="paymentInfo">
                    <label htmlFor="cardName">Name on Card</label>
                    <input type="text" id="cardName" />
                    <label htmlFor="cardNumber">Credit Card Number</label>
                    <input type="text" id="cardNumber" />
                    <label htmlFor="expMonth">Exp Month</label>
                    <input type="text" id="expMonth" />
                    <label htmlFor="expYear">Exp Year</label>
                    <input type="text" id="expYear" />
                    <label htmlFor="CVV">CVV</label>
                    <input type="text" id="CVV" />

                </div>
            </div>
            <div className="checkoutButton">
                <button onClick={() => updateQuantity(data)}>Make Purchase</button>
            </div>
        </div>
    );


}

export default CheckOut;