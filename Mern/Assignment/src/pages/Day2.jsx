import React from 'react'
import "./Day2.css"
const Day2 = () => {
  return (
    <div>
      <h4>
        🛠️ Practical Task — MERN Day 2
       </h4>
        <p>
       Task1:  Flexbox Task: Ek Navbar banao jisme Logo left side pe ho, Menu items (Home, About, Contact) right side pe ho, vertically centered — justify-content: space-between use karke.
        </p>
       <p> Task2: Grid Task: Ek 3x3 photo gallery grid banao jisme har image equal size ki ho, gap ho between images, aur 1 image 2 columns span kare (featured image).</p>

          <nav class="navbar">
            <div class="logo">Logo</div>

            <div class="Menu">
              <a href='#'>Home</a>
              <a href='#'>about</a>
              <a href='#'>Contact</a>
            </div>

            <div class="btn-container">
             <div class="button">
              <button>Login</button>
              <button>signup</button>
              </div> 
            </div>

          </nav>

    </div>

  )
}

export default Day2