import React, { useEffect, useState } from "react";
import axios from "axios";
import Comments from "./Comments";
import './style.css';



const API_Key = process.env.REACT_APP_API_KEY;

export default function DummyData(){
    const [data,setData] = useState([]);

    useEffect(() => {
        getData();
    }, [])

    const getData = async () => {
        const headers = {"app-id": API_Key}
        const response = await axios.get('https://dummyapi.io/data/v1/post?limit=15', {headers})
        setData(response.data.data);
        //console.log(response.data);
    }
    
    return(
        <div>
           {data.map((postData) => (
               <div className="postContainer" key={postData.id}>
                    <div className="post">
                        <img src={postData.owner.picture} alt="avatar"/>
                        <p>{postData.owner.firstName} {postData.owner.lastName}</p>
                        <p className="date">{postData.publishDate.substring(0,10)} {postData.publishDate.substring(11, 19)}</p>
                        <img src={postData.image} alt="postImage"/>
                        <h2 className="textPost">{postData.text}</h2>
                        <span>Likes: {postData.likes}</span>
                        <Comments id={postData.id}/>
                    </div>
               </div>
           ))}

        </div>
    )

}
{/*                     <div className="postContainer">
                        <div className="post">
                        <img src={postData.owner.picture} alt="avatar"/>
                        <p>Jak Daxter</p>
                        <p className="date">Today at 12:00pm</p>
                        <img src={postData.image} alt="postImage"/>
                        <h2 className="textPost">This is the post!</h2>
                        <span>Likes: 12 /Comments: 1</span> */}