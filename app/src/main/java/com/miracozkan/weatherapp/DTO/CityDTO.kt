package com.miracozkan.weatherapp.DTO


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 05/05/19 - 11:03            │
//└─────────────────────────────┘

data class CityDTO(
    val id: Long,
    val name: String,
    val coord: CoordDTO,
    val country: String
)