import React from 'react'

const Day1 = () => {
  return (
    <div>
      Day 1 Assignment


      <form action="/submit" method='Post'>
         <label>Name:</label>
         <input type='text'/>
         <br></br>
         <br></br>

         <label>Email:</label>
         <input type='email'/>

         <br></br>
         <br></br>

         <label>Password:</label>
         <input type='passowrd'/>

         <br></br>
         <br></br>

         <label>Confirm Password:</label>
         <input type='password'/>
         <br></br>
         <br></br>

         <label>Date of Birth:</label>
         <input type='date'></input>

         <br></br>
         <br></br>

         <label>Gender:</label>
         <input type="radio"
         name='gender'
            value="Male" />Male

            <input 
            type='radio'
             name='gender'
             value="Female"/>Female

      <br></br>
      <br></br>
        <label >City:</label>
        <select name="city" id="city">
          <option value="">Choose Option</option>
        <option value="delhi">Delhi</option>
        <option value="Mumbai">Mumbai</option>
        <option value="Rewa">Rewa</option>
        </select>
        <br></br>
        <br></br>
        <button type='submit'>Submit</button>
         
      </form>

    </div>
  )
}

export default Day1