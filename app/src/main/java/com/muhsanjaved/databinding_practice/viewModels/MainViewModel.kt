package com.muhsanjaved.databinding_practice.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.muhsanjaved.databinding_practice.models.DataProvider
import com.muhsanjaved.databinding_practice.models.Product

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var product = DataProvider.productList.get(1)

    fun getProduct(): Product = product

}