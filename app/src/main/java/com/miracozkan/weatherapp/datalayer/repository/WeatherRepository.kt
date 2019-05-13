package com.miracozkan.weatherapp.datalayer.repository

import androidx.lifecycle.MutableLiveData
import com.miracozkan.weatherapp.datalayer.model.ListItem
import com.miracozkan.weatherapp.datalayer.network.SendRequest
import com.miracozkan.weatherapp.viewmodel.BaseRepository


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │
//│ ─────────────────────────── │
//│ 10/05/19 - 19:21            │
//└─────────────────────────────┘


class WeatherRepository : BaseRepository() {

    var weather: MutableLiveData<List<ListItem>> = MutableLiveData()

    init {
        sendRequest()
    }

    private fun sendRequest() {
        SendRequest.getWeatherByCityName({ _, response ->
            weather.postValue(response.body()!!.list as List<ListItem>?)
        }, { _, _ ->
        })
    }
}