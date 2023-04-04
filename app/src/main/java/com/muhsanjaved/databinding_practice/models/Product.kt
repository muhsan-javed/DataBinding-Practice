package com.muhsanjaved.databinding_practice.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Product(
    val itemId: String,
    val name: String,
    val description: String,
    val price: Double,
    val salePrice: Double,
    val rating: Float,
    val totalRatings: Int,
    val image: String,
    val errorImage:Int,
    val placeholer:Int
) : Parcelable

/* : Parcelable {
 val priceMap : Map<String, Double> = mapOf<String, Double>(
     "price" to price,
     "sale_price" to salePrice
 )
}*/