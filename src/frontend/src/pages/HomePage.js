import React, { useEffect, useState } from 'react'
import { Header } from '../components/Header'
import { ImageSlider } from '../components/ImageSlider'
import { TeamTile } from '../components/TeamTile'
import './HomePage.scss'

export const HomePage = () => {
  const [teams, setTeams] = useState([])

  useEffect(() => {
    const getAllTeams = async () => {
      const response = await fetch(`http://localhost:8080/teams`)
      const data = await response.json()

      setTeams(data)
    }
    getAllTeams()
  }, [])

  return (
    <div className="HomePageOuter">
      <Header />
      <div>
        <ImageSlider />
      </div>
      <div className="HomePage">
        <div className="header-section">
          <h1 className="app-name">Tera IPL : Get all details of IPL</h1>
        </div>
        <div className="team-grid">
          {teams.map((team) => (
            <TeamTile
              teamName={team.teamName}
              totalMatches={team.totalMatches}
              totalWins={team.totalWins}
              key={team.id}
            ></TeamTile>
          ))}
        </div>
      </div>
    </div>
  )
}
