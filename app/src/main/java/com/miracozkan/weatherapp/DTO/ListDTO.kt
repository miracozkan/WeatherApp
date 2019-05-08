package com.miracozkan.weatherapp.DTO


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 05/05/19 - 11:06            │
//└─────────────────────────────┘

data class ListDTO(
    val dt: String,
    val main: MainDTO,
    val weather: List<ListWeatherDTO>,
    val clouds: CloudsDTO,
    val wind: WindDTO,
    val rain: RainDTO,
    val sys: SysDTO,
    val dt_txt: String

)