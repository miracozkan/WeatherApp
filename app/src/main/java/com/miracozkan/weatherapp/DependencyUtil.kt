package com.miracozkan.weatherapp

import com.miracozkan.weatherapp.datalayer.repository.WeatherRepository


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 2019-05-12 - 12:52          │
//└─────────────────────────────┘

object DependencyUtil {

    fun getWeatherRepository(): WeatherRepository = WeatherRepository()
}