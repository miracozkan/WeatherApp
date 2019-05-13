package com.miracozkan.weatherapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.miracozkan.weatherapp.DependencyUtil
import com.miracozkan.weatherapp.R
import com.miracozkan.weatherapp.adapter.WeatherListAdapter
import com.miracozkan.weatherapp.datalayer.model.ListItem
import com.miracozkan.weatherapp.viewmodel.ViewModelFactory
import com.miracozkan.weatherapp.viewmodel.WeatherViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val weatherRepository by lazy { DependencyUtil.getWeatherRepository() }
    private val weatherViewModel: WeatherViewModel by lazy {
        ViewModelProviders.of(
            this,
            ViewModelFactory(weatherRepository)
        ).get(WeatherViewModel::class.java)
    }

    private val data by lazy { ArrayList<ListItem>() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherViewModel.weather.observe(this, Observer { _list ->
            when (_list[0].weather[0].main) {
                "Rain" -> {
                    imgTopIcon.setBackgroundResource(R.drawable.ic_iconfinder_weather_storm)
                }
                "Clear" -> {
                    imgTopIcon.setBackgroundResource(R.drawable.ic_iconfinder_weather_few_clouds)
                }
                "Clouds" -> {
                    imgTopIcon.setBackgroundResource(R.drawable.ic_iconfinder_weather_showers_scattered)
                }
            }
            txtDes.text = _list[0].weather[0].description
            txtDegree.text = (_list[0].main.temp - 273.15).toInt().toString()

            for (i in 1 until _list.size) {
                data.add(_list[i])
            }
            with(recycWeatherList) {
                adapter = WeatherListAdapter(data)
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        })

        weatherViewModel.allData.observe(this, Observer { _allData ->
            Toast.makeText(this, _allData.city.name, Toast.LENGTH_LONG).show()
        })

    }
}