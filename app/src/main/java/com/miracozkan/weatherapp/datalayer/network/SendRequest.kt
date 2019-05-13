package com.miracozkan.weatherapp.datalayer.network

import com.miracozkan.weatherapp.datalayer.network.response.WeatherResponseByCityName
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │
//│ ─────────────────────────── │
//│ 10/05/19 - 19:21            │
//└─────────────────────────────┘


object SendRequest {

    fun getWeatherByCityName(
        onResponse:
            (call: Call<WeatherResponseByCityName>, response: Response<WeatherResponseByCityName>) -> Unit,
        onFailure:
            (call: Call<WeatherResponseByCityName>, t: Throwable) -> Unit
    ) {
        RetrofitClient
            .getClient()
            .create(WeatherService::class.java)
            .getWeatherByCityName(
                apiVersion = "2.5",
                cityName = "Ankara",
                apiKey = "0974f2c3965545dad807a2dfeff5a73a"
            ).enqueue(object : Callback<WeatherResponseByCityName> {
                override fun onResponse(
                    call: Call<WeatherResponseByCityName>,
                    response: Response<WeatherResponseByCityName>
                ) {
                    onResponse(call, response)
                }

                override fun onFailure(call: Call<WeatherResponseByCityName>, t: Throwable) {
                    onFailure(call, t)
                }
            })
    }
}