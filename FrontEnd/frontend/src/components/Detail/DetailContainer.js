import { func } from "prop-types"
import React, { useState, useEffect } from "react"
import axios from 'axios'

function DetailContainer(){

    axios({
        method: 'post',
        url:'localhost:8080/api/item',
        data:{
            ID:1
        }
    })
    .then(res=>{
        console.log("successful, response: ", res);
    })
    .catch(e=>console.warn(e))

    return(
        <div className="container">
            <p>Detailed Container</p>
        </div>
    )
}

export default DetailContainer;