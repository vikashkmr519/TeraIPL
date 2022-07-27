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
    }

    fetchMatch()
  }, [matchId])

  return (
    <div>
      <Header />
      <div className="SingleMatch">SingleMatch</div>
    </div>
  )
}
