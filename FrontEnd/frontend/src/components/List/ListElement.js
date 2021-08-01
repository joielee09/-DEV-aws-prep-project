import React, {useState, useEffect} from 'react';
import { Link } from 'react-router-dom'

function ListElement ({cur}) {

    const elemStyle={
        width: 300,
        height: 300,
        margin: 30,
        padding: 20,
        backgroundColor: 'white',
        cursor:"pointer",
        border:"1px white solid"
    }

    const imageStyle={
        width: 100,
        height:100
    }

    return (
        <Link
            to={{  pathname: `/getItem` }}
            style={{ 
                color:'black',
                textDecoration:'none'
            }}
        >
        <div className="container"
            style={elemStyle}>
            <h4>{cur.NAME}</h4>
            <img 
                src={cur.PICTURE}
                style={imageStyle}
            />
            <p>{cur.DETAIL.length>80? cur.DETAIL.slice(0,80)+'...' : cur.DETAIL}</p>
        </div>
        </Link>
    )
}
export default ListElement;