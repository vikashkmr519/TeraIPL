import { React, useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import { MatchDetailCard } from '../components/MatchDetailCard'

export const MatchPage = () => {
  const { teamName, year } = useParams()
  const [matches, setMatches] = useState([])

  useEffect(() => {
    const fetchMatches = async () => {
      const response = await fetch(
        `http://localhost:8080/team/${teamName}/matches?year=${year}`,
      )
      const data = await response.json()
      setMatches(data)
    }
    fetchMatches()
  }, [teamName, year])

  return (
    <div className="MatchPage">
      <h1>Match Page</h1>

      {matches.map((match) => (
        <MatchDetailCard
          teamName={match.gameNumber}
          match={match}
          key={match.id}
        />
      ))}
    </div>
  )
}
