package com.miracozkan.weatherapp.network.Response

import com.miracozkan.weatherapp.DTO.CityDTO
import com.miracozkan.weatherapp.DTO.ListDTO


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 05/05/19 - 12:26            │
//└─────────────────────────────┘

data class WeatherByCityNameResponse(
    val cod: String,
    val message: Double,
    val cnt: Int,
    val list: ArrayList<ListDTO>,
    val city: CityDTO
)