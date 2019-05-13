package com.miracozkan.weatherapp.datalayer.network.response

import com.google.gson.annotations.SerializedName
import com.miracozkan.weatherapp.datalayer.model.City
import com.miracozkan.weatherapp.datalayer.model.ListItem

// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │
//│ ─────────────────────────── │
//│ 10/05/19 - 19:21            │
//└─────────────────────────────┘


data class WeatherResponseByCityName(

    @field:SerializedName("city")
    val city: City,

    @field:SerializedName("cnt")
    val cnt: Int,

    @field:SerializedName("cod")
    val cod: String,

    @field:SerializedName("message")
    val message: Double,

    @field:SerializedName("list")
    val list: List<ListItem?>
)
