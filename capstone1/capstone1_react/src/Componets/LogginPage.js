import React, { useState, useEffect } from "react";
import { useNavigate } from 'react-router-dom'

function LogginPage({ isStaff, checkStaff }){

    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");
    let navigate = useNavigate();

    useEffect(() => {
        if(isStaff){    
            navigate("/staff");
        }
    })

    return(
        <div className="loginContainer">
            <div>
                <label htmlFor="user">User Name:</label>
                <input type="text" id="user" placeholder="User Name" onChange={(e) => setUserName(e.target.value)}></input>
                <label htmlFor="password">Password:</label>
                <input type="text" id="password" placeholder="Password" onChange={(e) => setPassword(e.target.value)}></input>
                <button onClick={() => checkStaff(userName,password)}>submit</button>
                
            </div>

        </div>
    );
}

export default LogginPage;