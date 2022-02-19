import React, { useState, useEffect} from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import ProductPage from './Componets/ProductPage';
import ProductDetails from './Componets/ProductDetails';
import NavBar from './Componets/NavBar';
import ShoppingCart from './Componets/ShoppingCart';
import products from './dataBase.json';


function App() {

  const [productData, setData] = useState([]);
  const [cartItems, setCartItems] = useState([]);

    useEffect(() => {
        setData(products.products);
    }, []);

  const itemQuantity = (item) =>{
    const moreItems = cartItems.find((data) => data.serialNumber === item.serialNumber);
     if(moreItems){
       setCartItems(cartItems.map((x) => x.serialNumber === item.serialNumber ? {...moreItems, qty: moreItems.qty + 1}: x))
     } else{
        setCartItems([...cartItems, {...item, qty: 1}]);
     }
  }

  const addToCart = (item) =>{
    if(cartItems.find((data) => data.serialNumber === item.serialNumber)){
    } else{
      setCartItems([...cartItems, {...item, qty: 1}]);
    }
    console.log(cartItems);
  }

  return (
    <BrowserRouter>
      <NavBar data={cartItems}/>
      <Routes>
        <Route path="/" element={<ProductPage data={productData}/>}/>
        <Route path='/product/:serialNumber' element = {<ProductDetails data={productData} addToCart={addToCart}/>}/>
        <Route path="/cart" element= {<ShoppingCart cartItems={cartItems}/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
