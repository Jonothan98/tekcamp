import { getSuggestedQuery } from "@testing-library/react";
import axios from "axios";
import react, { useEffect, useState } from "react";
import './style.css';

const API_Key = process.env.REACT_APP_API_KEY;

export default function Profile(){
    const [userData, setUserData] = useState([]);

    useEffect(() =>{
        getUser();
    },[])

    const getUser = async () => {
        const headers = {"app-id": API_Key} 
        const response = await axios.get('https://dummyapi.io/data/v1/user/60d0fe4f5311236168a109ca', {headers})
        setUserData(response.data)
        console.log(response.data)
    }

    return(
        <div className="profileContainer">
            <img src={userData.picture} alt="Profile picture"/>
            <h2>{userData.firstName} {userData.lastName}</h2>
            <h2>Gender: {userData.gender}</h2>
            <h2>{userData.dateOfBirth.substring(0,10)}</h2>
            <h2>City: {userData.location.city}</h2>
            <h2>State: {userData.location.state}</h2>
            <h2>Country: {userData.location.country}</h2>
        </div>
    );
}

{/* <div className="profileContainer">
            <img src="/" alt="avatar"/>
            <h2>Jonothan Castillo</h2>
            <h2>gender: Male</h2>
            <h2>July 12, 1998</h2>
            <h2>1234 Sesame street</h2>
        </div> */}

{/* <div>
            {userData.map((userInfo) => (
                <div className="profileContainer" key={userInfo.id}>
                    {console.log(userInfo)}
                    <img src="/" alt="avatar"/>
                    <h2>{userInfo.firstName}</h2>
                    <h2>gender: Male</h2>
                    <h2>July 12, 1998</h2>
                    <h2>1234 Sesame street</h2>
                </div>
            ))}
        </div> */}