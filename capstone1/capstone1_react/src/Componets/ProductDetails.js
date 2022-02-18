import React, { useState, useEffect} from "react";
import { useParams } from 'react-router-dom';
import products from '../dataBase.json';

function ProductDetails({data}){
    
    const { serialNumber } = useParams();



    return(
        <div>
            {data.filter(product => product.serialNumber == serialNumber).map((product, index) => (
                <div key={index}>
                    <h1>{product.name}</h1>
                    <h1>{product.price}</h1>
                </div>
            ))}
        </div>
    );
}

export default ProductDetails;