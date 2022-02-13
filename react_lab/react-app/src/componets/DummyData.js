import React, { useEffect, useState } from "react";
import axios from "axios";
import './style.css';



const API_Key = "6206d58efb08658db204d0b8";

export default function DummyData(){
    const [data,setData] = useState([]);

    useEffect(() => {
        getData();
    }, [])

    const getData = async () => {
        const headers = {"app-id": API_Key}
        const response = await axios.get('https://dummyapi.io/data/v1/post?limit=15', {headers})
        //console.log(response.data)
        setData(response.data.data);
    }
    
    return(
        <div>
           {data.map((postData) => (
               <div className="postContainer" key={postData.id}>
                    <div className="post">
                        <img src={postData.owner.picture} alt="avatar"/>
                        <p>Jak Daxter</p>
                        <p className="date">Today at 12:00pm</p>
                        <img src={postData.image} alt="postImage"/>
                        <h2 className="textPost">This is the post!</h2>
                        <span>Likes: 12 /Comments: 1</span>
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