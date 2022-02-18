import React, { useState, useEffect} from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import ProductPage from './Componets/ProductPage';
import ProductDetails from './Componets/ProductDetails';
import NavBar from './Componets/NavBar';
import ShoppingCart from './Componets/ShoppingCart';
import products from './dataBase.json';


function App() {

  const [productData, setData] = useState([]);

    useEffect(() => {
        setData(products.products);
    }, []);

  return (
    <BrowserRouter>
      <NavBar/>
      <Routes>
        <Route path="/" element={<ProductPage data={productData}/>}/>
        <Route path='/product/:serialNumber' element = {<ProductDetails data={productData}/>}/>
        <Route path="/cart" element= {<ShoppingCart data={productData}/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
