import React, { useState } from "react";

function StaffPage({ productData }) {

    const [toggleAdd, setToggle] = useState(false);

    let toggleProductItems = new Array(productData.length).fill(false);

    function printData(e) {
        e.preventDefault();
        console.log(e.target.name.value);
    }


    return (
        <div>
            <button onClick={() => setToggle(!toggleAdd)}>Add Item</button>
            <div>
                {toggleAdd && (
                    <form onSubmit={(e) => printData(e)}>
                        <label htmlFor="name">Product name:</label>
                        <input id="name" type="text" placeholder="Name" />
                        <label htmlFor="serialNumber">Product serial number:</label>
                        <input id="serialNumber" type="text" placeholder="Serial Number" />
                        <label htmlFor="price">Product price:</label>
                        <input id="price" type="text" placeholder="Price" />
                        <label htmlFor="manufacturer">Product manufacturer:</label>
                        <input id="manufacturer" type="text" placeholder="Manufacturer" />
                        <label htmlFor="tags">Product tags:</label>
                        <input id="tags" type="text" placeholder="tags" />
                        <label htmlFor="quantity">Product quantity:</label>
                        <input id="quantity" type="text" placeholder="quantity" />
                        <label htmlFor="image">Product image:</label>
                        <input id="image" type="text" placeholder="image link" />
                        <button>Add item to list</button>


                    </form>
                )}
            </div>
            <div>
                {productData.map((data) => {
                    return (
                        <div key={data.serialNumber}>
                            <div className="productDetailsContainer">
                                <h1>{data.name}</h1>
                                <p>Serial Number: {data.serialNumber}</p>
                                <p>Price: {data.price.toFixed(2)}</p>
                                <p>Manufacturer: {data.manufacturer}</p>
                                <p>Tags: {data.tags}</p>
                                <p>Quantity: {data.quantity}</p>
                                <button>Edit Item</button>
                            </div>
                            {toggleProductItems[data.length] && (
                                <form>
                                    <label htmlFor="name">Product name:</label>
                                    <input id="name" type="text" placeholder="Name" />
                                    <label htmlFor="serialNumber">Product serial number:</label>
                                    <input id="serialNumber" type="text" placeholder="Serial Number" />
                                    <label htmlFor="price">Product price:</label>
                                    <input id="price" type="text" placeholder="Price" />
                                    <label htmlFor="manufacturer">Product manufacturer:</label>
                                    <input id="manufacturer" type="text" placeholder="Manufacturer" />
                                    <label htmlFor="tags">Product tags:</label>
                                    <input id="tags" type="text" placeholder="tags" />
                                    <label htmlFor="quantity">Product quantity:</label>
                                    <input id="quantity" type="text" placeholder="quantity" />
                                    <label htmlFor="image">Product image:</label>
                                    <input id="image" type="text" placeholder="image link" />
                                    <button>Update Item</button>
                                </form>
                            )}
                            <button>Remove Item</button>
                        </div>
                    )
                })}
            </div>
        </div>
    );
}

export default StaffPage;