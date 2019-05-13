package com.miracozkan.weatherapp.datalayer.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.miracozkan.weatherapp.datalayer.model.ListItem
import com.miracozkan.weatherapp.datalayer.network.SendRequest
import com.miracozkan.weatherapp.datalayer.network.response.WeatherResponseByCityName
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
    var allData: MutableLiveData<WeatherResponseByCityName> = MutableLiveData()

    init {
        sendRequest()
        getCityName()
    }

    private fun sendRequest() {
        SendRequest.getWeatherByCityName({ _, response ->
            weather.postValue(response.body()!!.list as List<ListItem>?)
        }, { _, _ ->
            Log.e("Weather", "Something Got Wrong !!!")
        })
    }

    private fun getCityName() {
        SendRequest.getWeatherByCityName({ _, _response ->
            allData.postValue(_response.body()!!)
        }, { _, _ ->
            Log.e("cityName", "Something Got Wrong !!!")
        })
    }
}