package com.miracozkan.weatherapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miracozkan.weatherapp.R
import com.miracozkan.weatherapp.datalayer.model.ListItem


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 10/05/19 - 19:21            │
//└─────────────────────────────┘

class WeatherListViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.weather_adapter_list_item, parent, false)
) {
    private val txtHour by lazy { itemView.findViewById<TextView>(R.id.txtHour) }
    private val txtBotDegree by lazy { itemView.findViewById<TextView>(R.id.txtBotDegree) }
    private val imgbButton by lazy { itemView.findViewById<ImageView>(R.id.imgBotIcon) }

    fun bind(weatherResponse: ListItem) {
        txtHour.text = weatherResponse.dtTxt.substring(11, 16)
        txtBotDegree.text = (weatherResponse.main.temp - 273.15).toInt().toString()
        when (weatherResponse.weather[0].main) {
            "Rain" -> {
                imgbButton.setBackgroundResource(R.drawable.ic_iconfinder_weather_storm)
            }
            "Clear" -> {
                imgbButton.setBackgroundResource(R.drawable.ic_iconfinder_weather_few_clouds)
            }
            "Clouds" -> {
                imgbButton.setBackgroundResource(R.drawable.ic_iconfinder_weather_showers_scattered)
            }
        }
    }
}