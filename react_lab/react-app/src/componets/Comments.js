import react, { useEffect, useState } from "react";
import axios from "axios";
import './style.css';

const API_Key = process.env.REACT_APP_API_KEY;

export default function Comments({id}){
    const [comment, setComment] = useState([]);
    const [inputValue, setInputValue] = useState("");

    useEffect(() => {
        getComments(id)
    },[])

    const getComments = async (id) => {
        const headers = {"app-id": API_Key}
        const response = await axios.get(`https://dummyapi.io/data/v1/post/${id}/comment?limit=15`, {headers})
        setComment(response.data.data)
    }

    const addComment = async (e) => {
        e.preventDefault()
        const headers = {"app-id": API_Key, "Content-Type": "application/json"}
        const postComment = JSON.stringify({owner: "60d0fe4f5311236168a109ca", post: id, message: inputValue})
        const response = await axios.post("https://dummyapi.io/data/v1/comment/create",postComment, {headers})
        getComments(id)
    }

    return(
        <div>
            {comment.map((commentData) => (
                <div className="commentContainer" key={commentData.id}>
                    <img className="commentImage"src={commentData.owner.picture} alt="User Picture"/>
                    <div className="commentText">
                        <p className="commentName">{commentData.owner.firstName} {commentData.owner.lastName}</p>
                        <p className="date">{commentData.publishDate.substring(0,10)} {commentData.publishDate.substring(11, 19)}</p>
                        <p className="textPost">{commentData.message}</p>
                    </div>
                </div>
            ))}
            <form className="commentForm" onSubmit={(e) => {addComment(e)}}>
                <input onChange={(e) => {setInputValue(e.target.value)}} ></input>
                <button>Post Comment</button>
            </form>
        </div>
    );
}


