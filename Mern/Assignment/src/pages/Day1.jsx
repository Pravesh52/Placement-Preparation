import React from "react";
import "./Day1.css";

const Day1 = () => {
  return (
    <div className="container">
      <h2>Day 1 Assignment</h2>

      <form className="registration-form">
        <div className="form-group">
          <label>Name</label>
          <input type="text" />
        </div>

        <div className="form-group">
          <label>Email</label>
          <input type="email" />
        </div>

        <div className="form-group">
          <label>Password</label>
          <input type="password" />
        </div>

        <div className="form-group">
          <label>Confirm Password</label>
          <input type="password" />
        </div>

        <div className="form-group">
          <label>Date of Birth</label>
          <input type="date" />
        </div>

        <div className="form-group">
          <label>City</label>
          <select>
            <option value="">Choose Option</option>
            <option value="Delhi">Delhi</option>
            <option value="Mumbai">Mumbai</option>
            <option value="Rewa">Rewa</option>
          </select>
        </div>

        <div className="form-group full-width">
          <label>Gender</label>

          <div className="radio-group">
            <label>
              <input type="radio" name="gender" value="Male" />
              Male
            </label>

            <label>
              <input type="radio" name="gender" value="Female" />
              Female
            </label>
          </div>
        </div>

        <button className="submit-btn" type="submit">
          Submit
        </button>
      </form>
    </div>
  );
};

export default Day1;