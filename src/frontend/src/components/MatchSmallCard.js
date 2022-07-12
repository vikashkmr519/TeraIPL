import React from 'react'
import { Link } from 'react-router-dom'

export const MatchSmallCard = ({ teamName, match }) => {
  if (!match) return null
  const otherTeam = teamName === match.team1 ? match.team2 : match.team1
  const color = {
    color: 'blue',
  }
  const otherTeamRoute = `/teams/${otherTeam}`
  return (
    <div className="MatchSmallCard">
      <h3>
        {' '}
        vs <Link to={otherTeamRoute}>{otherTeam}</Link>
      </h3>
      <p style={color}>
        {match.winningTeam} won by {match.margin} {match.wonBy}
      </p>
      <hr></hr>
    </div>
  )
}
