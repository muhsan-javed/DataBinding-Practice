package com.muhsanjaved.databinding_practice.adapters

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.icu.text.NumberFormat
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.muhsanjaved.databinding_practice.R
import java.io.IOException
import java.util.*


@BindingAdapter("imageName")
fun setImageFromAssets(view: ImageView, fileName: String) {

    try {
        val bitmap: Bitmap = BitmapFactory.decodeStream(view.context?.assets?.open(fileName))
        view.setImageBitmap(bitmap)
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

//@BindingAdapter("imageUrl","placeholderImage","errorImage", requireAll = true)
@BindingAdapter(value = ["imageUrl", "placeholderImage", "errorImage"], requireAll = false)
fun loadImageFromInternet(view: ImageView, imageUrl: String, placeholderImage: Boolean, errorImage: Boolean) {
//fun loadImageFromInternet(view: ImageView, imageUrl:String, placeholderImage:Int, errorImage:Int){

    var requestOptions: RequestOptions = RequestOptions()
//        .error(errorImage)
//        .placeholder(placeholderImage)

    if (placeholderImage)
        requestOptions.placeholder(R.drawable.placeholderimage)

    if (errorImage)
        requestOptions.placeholder(R.drawable.errorimage)

    Glide.with(view.context)
        .setDefaultRequestOptions(requestOptions)
        .load(imageUrl)
        .into(view)
}

@BindingAdapter("priceText")
fun setPriceText(view: TextView, price: Double) {
    val formatter: NumberFormat = NumberFormat.getCurrencyInstance(Locale.US)

    view.text = "Rs. ${price} / each"
}

@BindingAdapter("ratingText")
fun setRatingText(view: TextView, rating:Int) {
    view.text = "($rating)"
}

@BindingAdapter("android:text")
fun setText(view: TextView, text:Double) {
    view.text = "$text"
}