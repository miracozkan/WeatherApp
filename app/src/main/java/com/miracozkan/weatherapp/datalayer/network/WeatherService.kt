package com.miracozkan.weatherapp.datalayer.network

import com.miracozkan.weatherapp.datalayer.network.response.WeatherResponseByCityName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 05/05/19 - 11:00            │
//└─────────────────────────────┘

interface WeatherService {
    @GET("{apiVersion}/forecast/hourly")
    fun getWeatherByCityName(
        @Path("apiVersion") apiVersion: String,
        @Query("q") cityName: String,
        @Query("appid") apiKey: String
    ): Call<WeatherResponseByCityName>
}