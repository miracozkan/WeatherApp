package com.miracozkan.weatherapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miracozkan.weatherapp.datalayer.model.ListItem


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 10/05/19 - 19:19            │
//└─────────────────────────────┘

class WeatherListAdapter(
    private val weatherList: List<ListItem>? = null
) : RecyclerView.Adapter<WeatherListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherListViewHolder {
        return WeatherListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return weatherList!!.size
    }

    override fun onBindViewHolder(holder: WeatherListViewHolder, position: Int) {
        holder.bind(weatherList!![position])
    }

}