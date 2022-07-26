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
        <div className="content-text">
          <p className="text">
            Tera IPL is an IPL Information platform. It gives you details
            related to different matches played between different teams. You can
            view each teams latest matches played. The Green color of a match
            represent the Team has won the match , for whom you have opened the
            Page. And Red Shows that , the current team lost the match, against
            the team mentioned after VS 'Team Name'. You can also check the
            matches a team has won or lost in a particular season. The developer
            of the website is Vikash Kumar. He has done his graduation in
            Bachelor Of Technology with Computer Science and Engineering as the
            Stream.
          </p>
        </div>
        <div className="MyImage">
          <img className="Image" src="/images/me.jpeg" alt="Vikash Kumar" />
        </div>
      </div>
      <div className="socialText">
        <h2 className="text">Social Accounts</h2>
      </div>
      <div className="socials">
        <div>
          <img src="" alt="Github"></img>
          Github
        </div>
        <div>LinkedIn</div>
        <div>Email</div>
        <div>Instagram</div>
      </div>
    </div>
  )
}
