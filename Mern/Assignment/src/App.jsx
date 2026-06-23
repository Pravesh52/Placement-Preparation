import React from 'react'
import { Link, Route, Routes } from 'react-router-dom'
import Day1 from './pages/Day1'
import Day2 from './pages/Day2'

const App = () => {
  return (
    <div>
     <h3>Mern Stack Assignment</h3>
     
       <Link to="/day1">
       <button style={{cursor:'pointer'}}>Day1</button>
       </Link>

       <Link to="/day2">
       <button style={{cursor:'pointer'}}>Day2</button>
       </Link>
       
       <Routes>
        <Route path="/day1" element={<Day1/>} />
        
        <Route path="/day2" element={< Day2/>}></Route>
        
       </Routes>


    </div>
  )
}

export default App