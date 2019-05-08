package com.miracozkan.weatherapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.miracozkan.weatherapp.network.Response.WeatherByCityNameResponse
import com.miracozkan.weatherapp.network.RetrofitClient
import com.miracozkan.weatherapp.network.WeatherServices
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<WeatherByCityNameResponse> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        RetrofitClient.getClient()
            .create(WeatherServices::class.java)
            .getWeather("2.5", "London", "a17e19e4c74080d24b6ae73462525a99")
            .enqueue(this)
    }

    override fun onFailure(call: Call<WeatherByCityNameResponse>, t: Throwable) {
        Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_SHORT).show()
    }

    override fun onResponse(call: Call<WeatherByCityNameResponse>, response: Response<WeatherByCityNameResponse>) {

        when (response.body()!!.list[0].weather[0].main) {
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
        txtDes.text = response.body()!!.list[0].weather[0].description
        txtDegree.text = response.body()!!.list[0].main.temp

        //->1
        txtHour.text = response.body()!!.list[1].dt_txt.substring(11, 16)
        txtBotDeggre.text = response.body()!!.list[1].main.temp
        when (response.body()!!.list[1].weather[0].main) {
            "Rain" -> {
                imgBotIcon.setBackgroundResource(R.drawable.ic_iconfinder_weather_storm)
            }
            "Clear" -> {
                imgBotIcon.setBackgroundResource(R.drawable.ic_iconfinder_weather_few_clouds)
            }
            "Clouds" -> {
                imgBotIcon.setBackgroundResource(R.drawable.ic_iconfinder_weather_showers_scattered)
            }
        }
        //->2
        txtHour1.text = response.body()!!.list[2].dt_txt.substring(11, 16)
        txtBotDeggre1.text = response.body()!!.list[2].main.temp
        when (response.body()!!.list[1].weather[0].main) {
            "Rain" -> {
                imgBotIcon1.setBackgroundResource(R.drawable.ic_iconfinder_weather_storm)
            }
            "Clear" -> {
                imgBotIcon1.setBackgroundResource(R.drawable.ic_iconfinder_weather_few_clouds)
            }
            "Clouds" -> {
                imgBotIcon1.setBackgroundResource(R.drawable.ic_iconfinder_weather_showers_scattered)
            }
        }
        //->3
        txtHour2.text = response.body()!!.list[3].dt_txt.substring(11, 16)
        txtBotDeggre2.text = response.body()!!.list[3].main.temp

        //      imgTopIcon.setBackgroundResource(response.body()!!.list[3].weather[0].main.getWeatherIcon())

    }
}

fun String.getWeatherIcon(): String {
    return "http://openweathermap.org/img/w/${this}.png"
}
