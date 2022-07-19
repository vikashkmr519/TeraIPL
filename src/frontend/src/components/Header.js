import React from 'react'
import { Link } from 'react-router-dom'
import './Header.scss'

export const Header = () => {
  return (
    <div className="Header">
      <img className="Logo" src="/images/TeraIplLogo.png" alt="Tera IPL"></img>
      <div className="Home">
        <Link to="/">Home</Link>
      </div>
    </div>
  )
}
