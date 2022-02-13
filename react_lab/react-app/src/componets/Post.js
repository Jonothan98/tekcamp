import React, { useEffect, useState } from "react";
import dummyData from './DummyData';
import './style.css';



function Post(postData){
    return(
        <div className="postContainer">
            <div className="post">
                <img src="/" alt="avatar"/>
                <p>Jak Daxter</p>
                <p className="date">Today at 12:00pm</p>
                <h2 className="textPost">This is the post!</h2>
                <span>Likes: 12 /Comments: 1</span>
            </div>
        </div>
    );
}

export default Post;