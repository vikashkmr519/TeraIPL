import { React, useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import { MatchDetailCard } from '../components/MatchDetailCard'
import './MatchPage.scss'
import { YearSelector } from './YearSelector'

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
      <div className="year-selector">
        <h3>Select Year</h3>
        <YearSelector teamName={teamName} />
      </div>
      <div>
        <h1 className="page-heading">
          Matches of {teamName} in {year}
        </h1>
        {matches.map((match) => (
          <MatchDetailCard
            teamName={match.team1}
            match={match}
            key={match.id}
          />
        ))}
      </div>
    </div>
  )
}
