import react from "react";
import Navbar from "./componets/Navbar";
import Comments from "./componets/Comments";
import Profile from "./componets/Profile"
import './componets/style.css';
import DummyData from "./componets/DummyData";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function App() {
  return (
    <div>
      <BrowserRouter>
        <Navbar/>
        <Routes>
          <Route path="/" exact element = { <DummyData/> }/>
          <Route path="/profile" exact element = {<Profile/>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
