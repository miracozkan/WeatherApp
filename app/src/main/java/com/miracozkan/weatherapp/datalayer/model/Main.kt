package io.androidedu.androidarchitecturesample.datalayer.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN      │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com    │
//│ ─────────────────────────── │
//│ 10/05/19 - 19:21            │
//└─────────────────────────────┘


@Entity(tableName = "Main")
data class Main(


    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    val _id: Long = 0L,

    @ColumnInfo
    @field:SerializedName("temp")
    val temp: Double,

    @ColumnInfo(name = "temp_min")
    @field:SerializedName("temp_min")
    val tempMin: Double,

    @ColumnInfo(name = "grnd_level")
    @field:SerializedName("grnd_level")
    val grndLevel: Double,

    @ColumnInfo(name = "temp_kf")
    @field:SerializedName("temp_kf")
    val tempKf: Double,

    @ColumnInfo
    @field:SerializedName("humidity")
    val humidity: Int,

    @ColumnInfo
    @field:SerializedName("pressure")
    val pressure: Double,

    @ColumnInfo(name = "sea_level")
    @field:SerializedName("sea_level")
    val seaLevel: Double,

    @ColumnInfo(name = "temp_max")
    @field:SerializedName("temp_max")
    val tempMax: Double
)