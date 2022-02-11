import react from "react";
import './style.css';

function Comments(){
    return(
        <div className="commentContainer"> 
            <div className="comment">
                <img src="" alt="avatar"/>
                <div className="commentInfo">
                    <span className="date">Today at 6:00pm</span>
                    <p className="text">nice post buddy</p>
                </div>
            </div>
        </div>
    );
}

export default Comments;