package com.miracozkan.weatherapp.datalayer.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import io.androidedu.androidarchitecturesample.datalayer.model.Main

// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │
//│ ─────────────────────────── │
//│ 10/05/19 - 19:21            │
//└─────────────────────────────┘


@Entity(tableName = "ListItem")
data class ListItem(
    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    val _id: Long = 0L,

    @ColumnInfo
    @field:SerializedName("dt")
    val dt: Int,

    @ColumnInfo(name = "dt_txt")
    @field:SerializedName("dt_txt")
    val dtTxt: String,

    @ColumnInfo
    @field:SerializedName("weather")
    val weather: List<WeatherItem>,

    @ColumnInfo
    @field:SerializedName("main")
    val main: Main,

    @ColumnInfo
    @field:SerializedName("clouds")
    val clouds: Clouds,

    @ColumnInfo
    @field:SerializedName("sys")
    val sys: Sys,

    @ColumnInfo
    @field:SerializedName("wind")
    val wind: Wind,

    @ColumnInfo
    @field:SerializedName("rain")
    val rain: Rain
)