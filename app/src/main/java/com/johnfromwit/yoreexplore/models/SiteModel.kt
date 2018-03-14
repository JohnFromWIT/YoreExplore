package com.johnfromwit.yoreexplore.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class SiteModel(var townland: String = "",
                          var county: String = "")
//
//@Parcelize
//@Entity
//data class SiteModel(@PrimaryKey(autoGenerate = true) var id: Long = 0,
//                         var townland: String = "",
//                         var picture: String = "",
//                         var dateVisited: String = "",
//                         var county: String = "",
//                         var lat: Double = 0.0,
//                         var lng: Double = 0.0,
//                         var zoom: Float = 0f
//) : Parcelable

