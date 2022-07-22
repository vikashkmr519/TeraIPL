import React from 'react'
import { DataSlider } from './DataSlider'

export const ImageSlider = () => {
  return (
    <div className="ImageSlider">
      {DataSlider.map((img) => (
        <div>
          <img src={img.img}></img>
        </div>
      ))}
    </div>
  )
}
