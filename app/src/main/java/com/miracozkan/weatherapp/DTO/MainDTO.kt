package com.miracozkan.weatherapp.DTO


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 05/05/19 - 11:08            │
//└─────────────────────────────┘

data class MainDTO(
    val temp: String,
    val temp_min: String,
    val temp_max: String,
    val pressure: String,
    val sea_level: String,
    val grnd_level: String,
    val humidity: String,
    val temp_kf: String
)