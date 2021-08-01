import React, {useState, useEffect} from 'react';
import './App.css';

import { BrowserRouter , Route } from 'react-router-dom';
import DetailPresenter from './components/Detail/DetailPresenter';
import DetailContainer from './components/Detail/DetailContainer';
import ListContainer from './components/List/ListContainer';
import Header from './components/Modules/Header';

function App () {

  return (
    <BrowserRouter>
    <Header />
    <Route exact path='/' component={ListContainer}/>
    <Route exact path='/getItem' component={DetailContainer} />
    </BrowserRouter>
  )
}
export default App;