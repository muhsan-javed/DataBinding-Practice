package com.muhsanjaved.databinding_practice.utils

object StringUtils {

    @JvmStatic
    fun getTotalRatings(totalRating: Int ):String {
        return "($totalRating)"
    }

    @JvmStatic
    fun getFormattedPrice(price: Double ):String {
        return "($price)"
    }
}