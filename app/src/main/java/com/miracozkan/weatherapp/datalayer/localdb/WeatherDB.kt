package com.miracozkan.weatherapp.datalayer.localdb


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │            
//│ ─────────────────────────── │
//│ 11/05/19 - 10:45            │
//└─────────────────────────────┘

//@Database(
//    entities = [City::class, Clouds::class, Coord::class, ListItem::class, WeatherItem::class,
//        Main::class, Rain::class, Sys::class, WeatherResponseByCityName::class, Wind::class],
//    version = 2
//)
//abstract class WeatherDB : RoomDatabase() {
//    //        abstract fun youtubeDAO(): YoutubeDAO
//    companion object {
//        private var INSTANCE: WeatherDB? = null
//        fun getInstance(context: Context): WeatherDB? {
//            synchronized(WeatherDB::class) {
//                if (INSTANCE == null) {
//                    INSTANCE = Room.databaseBuilder(
//                        context.applicationContext,
//                        WeatherDB::class.java, "db_weather"
//                    )
//                        .fallbackToDestructiveMigration()
//                        .build()
//                }
//            }
//            return INSTANCE
//        }
//    }
//}