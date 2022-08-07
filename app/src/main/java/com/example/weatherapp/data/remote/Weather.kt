package com.example.weatherapp.data.remote

import com.squareup.moshi.Json

data class Weather(
    @field:Json(name = "hourly")
    val weatherApiData: WeatherApiData
)
