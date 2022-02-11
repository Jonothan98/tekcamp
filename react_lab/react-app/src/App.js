import react from "react";
import Navbar from "./componets/Navbar";
import Comments from "./componets/Comments";
import Post from "./componets/Post";
import Profile from "./componets/Profile"
import './componets/style.css';

function App() {
  return (
    <div >
        <Navbar/>
        <Post/>
        <Comments/>
        <Profile/>

    </div>
  );
}

export default App;
