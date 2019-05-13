package com.miracozkan.weatherapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.miracozkan.weatherapp.datalayer.model.ListItem
import com.miracozkan.weatherapp.datalayer.network.response.WeatherResponseByCityName
import com.miracozkan.weatherapp.datalayer.repository.WeatherRepository


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │
//│ ─────────────────────────── │
//│ 10/05/19 - 19:21            │
//└─────────────────────────────┘


class WeatherViewModel(weatherRepository: WeatherRepository) : ViewModel() {

    val weather: MutableLiveData<List<ListItem>> = weatherRepository.weather
    val allData: MutableLiveData<WeatherResponseByCityName> = weatherRepository.allData
}