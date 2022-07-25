import React from 'react'
import { Header } from '../components/Header'
import './AboutUs.scss'
export const AboutUs = () => {
  return (
    <div className="AboutUs">
      <Header />

      <div className="aboutUsText">
        <h1 className="text">About Us</h1>
      </div>
      <div className="content">
        <div>text about tera ipl</div>
        <div>Image of me</div>
      </div>
      <div>
        <h2>Socially Awkard moment !!..</h2>
        <div>Github github image and then github Link as a form of box</div>
        <div>LinkedIn</div>
        <div>Email</div>
        <div>Instagram</div>
      </div>
    </div>
  )
}
