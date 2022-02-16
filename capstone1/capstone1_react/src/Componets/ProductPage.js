import React,{ useState, useEffect } from "react";
import products from '../dataBase.json'


function ProductPage(){

    const [productData, setData] = useState([]);

    useEffect(() => {
        setData(products.products);
        console.log(productData);
    }, []);
    
    return(
        <div>
            {productData.map((data) => {
                return(
                <div key={data.serialNumber}>
                    <h1>{data.name}</h1>
                    <h1>{data.serialNumber}</h1>
                    <h1>{data.price}</h1>
                    <h1>{data.manufacturer}</h1>
                    <h1>{data.tags}</h1>
                    <h1>{data.quantity}</h1>
                    <img src={ process.env.PUBLIC_URL + data.image} alt="Product Image"/>
                </div>
                )
            })}
        </div>
    );
}

export default ProductPage;