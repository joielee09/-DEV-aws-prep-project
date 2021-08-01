import axios from 'axios';
import React, {useState, useEffect} from 'react';
import ListPresenter from './ListPresenter';

function ListContainer () {
    const [message, setMessage] = useState("");

    const getStock = async () => {
        const{
            data: result
        } = await axios.get("http://localhost:8080/api/stock");
        setMessage(result)
    }

    useEffect(()=>{
        getStock();
    },[])
    
    if(message){
        return(
            <div className="Container">
                <ListPresenter cur={message} />
            </div>
        );
    } else {
        return(
            <div className="Container">
            </div>
        );
    }
}   
export default ListContainer;