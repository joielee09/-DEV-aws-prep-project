import React, {useState, useEffect} from 'react';

function Header(){
    return(
        <div 
        className="Header"
        style={{
            height: 300,
            display:'flex',
            alignItems: 'center',
            justifyContent:'center'
        }}
        >
            <h1>탄소 노노 ✋✋</h1>
        </div>
    )
}

export default Header;