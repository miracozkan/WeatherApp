package com.miracozkan.weatherapp.network

import com.miracozkan.weatherapp.network.Response.WeatherByCityNameResponse
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

interface WeatherServices {
    @GET("data/{version}/forecast/hourly")
    fun getWeather(
        @Path("version") version: String,
        @Query("q") cityName: String,
        @Query("appid") appID: String
    ): Call<WeatherByCityNameResponse>


}