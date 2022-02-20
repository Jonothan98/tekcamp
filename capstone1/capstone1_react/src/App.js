import React, { useState, useEffect} from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import ProductPage from './Componets/ProductPage';
import ProductDetails from './Componets/ProductDetails';
import NavBar from './Componets/NavBar';
import ShoppingCart from './Componets/ShoppingCart';
import CheckOut from './Componets/CheckOut';
import StaffPage from './Componets/StaffPage';
import LogginPage from './Componets/LogginPage';
import products from './dataBase.json';


function App() {

  const [productData, setData] = useState([]);
  const [cartItems, setCartItems] = useState([]);
  const [isStaff, setStaff] = useState(false);

    useEffect(() => {
        setData(products.products);
    }, []);

  const addItem = (item) =>{
    const moreItems = cartItems.find((data) => data.serialNumber === item.serialNumber);
     if(moreItems && moreItems.qty === item.quantity){
        alert(`There is only ${moreItems.quantity} left in stock for this item`);
     }else if(moreItems){
      setCartItems(cartItems.map((x) => x.serialNumber === item.serialNumber ? {...moreItems, qty: moreItems.qty + 1}: x))
     }
  }
  
  const removeItem = (item) =>{
    const lessItems = cartItems.find((data) => data.serialNumber === item.serialNumber);
    if(lessItems.qty === 1){
      setCartItems(cartItems.filter((data) => data.serialNumber !== item.serialNumber))
    } else{
      setCartItems(cartItems.map((data) => data.serialNumber === item.serialNumber ? {...lessItems, qty: lessItems.qty - 1}: data))
    }
  }

  const addToCart = (item) =>{
    const moreItems = cartItems.find((data) => data.serialNumber === item.serialNumber);
    if(!moreItems && item.quantity > 0){
      setCartItems([...cartItems, {...item, qty: 1}]);
    } 
  }

  const updateQuantity = (item) => {

    item.map((itemData) => (
      setData(productData.map((data) => data.serialNumber === itemData.serialNumber ? {...data, quantity: data.quantity - itemData.qty}: data))
    ))
    
    setCartItems([]);

  }

  function checkStaff(userName,password){
      if(userName !== "" && password !== ""){
        setStaff(true);
      }
  }

  function logOut(){
    setStaff(false);
  }

  return (
    <BrowserRouter>
      <NavBar data={productData} cartItems={cartItems} isStaff={isStaff} logOut={logOut}/>
      <Routes>
        <Route path="/" element={<ProductPage data={productData}/>}/>
        <Route path='/product/:serialNumber' element = {<ProductDetails data={productData} addToCart={addToCart}/>}/>
        <Route path="/cart" element= {<ShoppingCart cartItems={cartItems} addItem={addItem} removeItem={removeItem}/>}/>
        <Route path="/checkout" element={<CheckOut data={cartItems} updateQuantity={updateQuantity}/>}/>
        <Route path="/login" element={<LogginPage isStaff={isStaff} checkStaff={checkStaff}/>}/>
        <Route path="/staff" element={<StaffPage/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
