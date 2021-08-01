import React, {useState, useEffect} from 'react';
import Elem from './ListElement';
import Header from '../Modules/Header';

function ListPresenter ({ cur }) {
    console.log(cur)
    const ListStyle={
        flex:1,
        display:'flex',
        alignItems: 'center',
        justifyContent:'center',
        flexWrap: 'wrap',
        flexDirection: 'row',
        background: "linear-gradient(white, green)"
    }
    return(
        <div className="Container" style={ListStyle}>
        {cur.map(item=>(
            <Elem cur={item}/>
        ))}
        </div>
    );
}   
export default ListPresenter;