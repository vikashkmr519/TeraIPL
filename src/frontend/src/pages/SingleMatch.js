import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import { Header } from '../components/Header'
import './SingleMatch.scss'

export const SingleMatch = () => {
  const { matchId } = useParams()
  const [match, setMatch] = useState(null)

  useEffect(() => {
    const fetchMatch = async () => {
      const response = await fetch(`http://localhost:8080/match/${matchId}`)
      const data = await response.json()
      setMatch(data)
      console.log(data)
    }

    fetchMatch()
  }, [matchId])

  return (
    <div>
      <Header />
      <div className="SingleMatch">
        <div className="top-data">
          <div className="gsd">
            <div>Game number : {match.gameNumber}</div>
            <div>season : {match.season}</div>
            <div>Date : {match.date}</div>
          </div>
          <div className="umpires">
            <h2>Umpires</h2>
            <p>{match.umpire1}</p>
            <p>{match.umpire2}</p>
          </div>
        </div>
        <div className="teamvs">
          <h2>{match.team1}</h2>
          <p>vs</p>
          <h2>{match.team2}</h2>
        </div>
        <div className="venue">
          <h3 className="venueText">Venue : </h3>
          <h3 className="venueOutput">{match.venue}</h3>
        </div>
        <div className="toss">
          <div className="tossWinner">
            <p>Toss Winner : {match.tossWinner}</p>
          </div>
          <div className="tossDecision">
            <p>Toss Decision : {match.tossDecision}</p>
          </div>
        </div>

        <div className="winner">
          <div>
            {match.winningTeam} won by {match.margin} {match.wonBy}
          </div>
        </div>

        <div className="manOfTheMatch">
          <h2>Man Of The Match : </h2>
          <h2>{match.playerOfMatch}</h2>
        </div>
      </div>
    </div>
  )
}
