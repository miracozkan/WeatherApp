package com.miracozkan.weatherapp.DTO


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 05/05/19 - 11:09            │
//└─────────────────────────────┘

data class ListWeatherDTO(
    val id: Long,
    val main: String,
    val description: String,
    val icon: String
)