import react from "react";
import './style.css';

function Post(){
    return(
        <div className="postContainer">
            <div className="post">
                <img src="/" alt="avatar"/>
                <p className="date">Today at 12:00pm</p>
                <h2 className="textPost">This is the post!</h2>
            </div>
        </div>
    );
}

export default Post;