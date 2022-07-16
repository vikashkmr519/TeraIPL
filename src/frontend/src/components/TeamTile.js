import React from 'react'
import './TeamTile.scss'
import { PieChart } from 'react-minimal-pie-chart'
import { Link } from 'react-router-dom'

export const TeamTile = ({ teamName, totalMatches, totalWins }) => {
  return (
    <div className="TeamTile">
      <Link to={`teams/${teamName}`}>
        <div>
          <h1 className="team-name">{teamName}</h1>
          <h2>Total Matches : {totalMatches}</h2>
          <h2>Total Wins : {totalWins}</h2>
        </div>
      </Link>
    </div>
  )
}
