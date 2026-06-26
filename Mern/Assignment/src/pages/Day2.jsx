import React from "react";
import "./Day2.css";

const Day2 = () => {
  return (
    <div>

      <h4>🛠️ Practical Task — MERN Day 2</h4>

      <p>
        <strong>Task 1:</strong> Flexbox Task: Ek Navbar banao jisme Logo left
        side pe ho, Menu items (Home, About, Contact) right side pe ho,
        vertically centered — justify-content: space-between use karke.
      </p>

      <p>
        <strong>Task 2:</strong> Grid Task: Ek 3×3 photo gallery grid banao
        jisme har image equal size ki ho, gap ho between images, aur 1 image 2
        columns span kare (featured image).
      </p>

      {/* Navbar */}

      <nav className="navbar">

        <div className="logo">
          Logo
        </div>

        <div className="menu">
          <a href="#">Home</a>
          <a href="#">About</a>
          <a href="#">Contact</a>
        </div>

        <div className="btn-container">
          <button>Login</button>
          <button>Signup</button>
        </div>

      </nav>

      {/* Photo Gallery */}

      <div className="gallery">

        <img
          src="https://picsum.photos/id/1015/400/300"
          alt="Image 1"
          className="featured"
        />

        <img
          src="https://picsum.photos/id/1016/400/300"
          alt="Image 2"
        />

        <img
          src="https://picsum.photos/id/1018/400/300"
          alt="Image 3"
        />

        <img
          src="https://picsum.photos/id/1020/400/300"
          alt="Image 4"
        />

        <img
          src="https://picsum.photos/id/1024/400/300"
          alt="Image 5"
        />

        <img
          src="https://picsum.photos/id/1025/400/300"
          alt="Image 6"
        />

        <img
          src="https://picsum.photos/id/1035/400/300"
          alt="Image 7"
        />

        <img
          src="https://picsum.photos/id/1039/400/300"
          alt="Image 8"
        />

        <img
          src="https://picsum.photos/id/1043/400/300"
          alt="Image 9"
        />

      </div>

    </div>
  );
};

export default Day2;