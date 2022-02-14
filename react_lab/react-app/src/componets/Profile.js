import axios from "axios";
import react, { useEffect, useState } from "react";
import './style.css';

const API_Key = process.env.REACT_APP_API_KEY;

export default function Profile(){
    const [userData, setUserData] = useState({});
    const [userBday, setUserBday] = useState("");
    const [userLocation, setUserLocation] = useState({});

    useEffect(() =>{
        getUser()

    },[])

    const getUser = async () => {
        const headers = {"app-id": API_Key} 
        const response = await axios.get('https://dummyapi.io/data/v1/user/60d0fe4f5311236168a109ca', {headers})
        setUserData(response.data)
        setUserLocation(response.data.location)
        setUserBday(response.data.dateOfBirth)

        //console.log(response.data)
    }


    return(
        <div className="profileContainer">
            <img src={userData.picture} alt="Profile picture"/>
            <h2>{userData.firstName} {userData.lastName}</h2>
            <h2>Gender: {userData.gender}</h2>
            <h2>BirthDate: {userBday.substring(0,10)}</h2>
            <h2>City: {userLocation.city}</h2>
            <h2>State: {userLocation.state}</h2>
            <h2>Country: {userLocation.country}</h2>
        </div>
    );

}