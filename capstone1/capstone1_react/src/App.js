import React from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import ProductPage from './Componets/ProductPage';
import ProductDetails from './Componets/ProductDetails';




function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<ProductPage/>}/>
        <Route path='/:productID' element = {<ProductDetails/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
