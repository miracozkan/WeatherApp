package com.miracozkan.weatherapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.miracozkan.weatherapp.datalayer.repository.WeatherRepository


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │
//│ ─────────────────────────── │
//│ 10/05/19 - 19:21            │
//└─────────────────────────────┘


class ViewModelFactory constructor(private val repository: BaseRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return if (modelClass.isAssignableFrom(WeatherViewModel::class.java)) {

            WeatherViewModel(this.repository as WeatherRepository) as T

        } else {

            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}