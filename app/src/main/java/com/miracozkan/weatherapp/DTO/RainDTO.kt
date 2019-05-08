package com.miracozkan.weatherapp.DTO

import com.google.gson.annotations.SerializedName


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 05/05/19 - 11:14            │
//└─────────────────────────────┘

data class RainDTO(
    @SerializedName("3h")
    val threeh: String
)