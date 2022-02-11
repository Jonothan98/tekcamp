import react from "react";
import axios from "axios";
import './style.css';

const API_Key = process.env.REACT_APP_API_KEY;

function Post(){
    return(
        <div className="postContainer">
            <div className="post">
                <img src="/" alt="avatar"/>
                <p className="date">Today at 12:00pm</p>
                <h2 className="textPost">This is the post!</h2>
                <span>Likes: 12 /Comments: 1</span>
            </div>
        </div>
    );
}

export default Post;