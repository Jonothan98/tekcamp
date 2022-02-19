import React, { useState, useEffect } from "react";
import { useParams } from 'react-router-dom';
import './Styles/productDetails.css';

function ProductDetails({ data, addToCart }) {

    const { serialNumber } = useParams();



    return (
        <div>
            {data.filter(product => product.serialNumber == serialNumber).map((product, index) => (
                <div key={index} className="detailContainer">
                    <div className="imageContainer">
                        <img className="proImage" src={product.image} alt="Product Image" />
                    </div>
                    <div className="textContainer">
                        <h1 className="productName">{product.name}</h1>
                        <h1>Price: {product.price}</h1>
                        <h1>Serial Number: {product.serialNumber}</h1>
                        <h1>Manufacturer: {product.manufacturer}</h1>
                        <h1>Tags: {product.tags}</h1>
                        <h1>Quantity: {product.quantity}</h1>
                        <button htmlFor="quantity" onClick={() => addToCart(product)}>Add to Cart</button>
                    </div>
                </div>
            ))}
        </div>
    );
}

export default ProductDetails;