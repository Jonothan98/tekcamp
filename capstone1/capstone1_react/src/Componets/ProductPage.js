import React,{ useState, useEffect } from "react";
import { Link } from 'react-router-dom';
import './Styles/productPage.css';


function ProductPage({data}){
    
    return(
        <div>
            <div>
                <img className="heroImage" src="https://media.istockphoto.com/photos/school-supplies-picture-id1338302279?b=1&k=20&m=1338302279&s=170667a&w=0&h=hBbKPyS9bZCbHT3jGF2eH__oGxnrTVHVWNKcYuNt6hY="/>
            </div>
            <div className="pageContainer">
                {data.map((data) => {
                    return(
                    <div className="productContainer" key={data.serialNumber}>
                        <img className="productImage" src={data.image} alt="Product Image"/>
                        <h1>{data.name}</h1>
                        <h1>Price: ${data.price}</h1>
                        <Link to={`/product/${data.serialNumber}`} className="linkButton">Item Details</Link>
                    </div>
                    )
                })}
            </div>
        </div>
    );
}

export default ProductPage;