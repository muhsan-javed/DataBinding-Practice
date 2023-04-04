package com.muhsanjaved.databinding_practice.interfaces

import com.muhsanjaved.databinding_practice.models.Product

interface IMainActivity {

    fun onProductClick(product: Product)

    fun onProductImageClick(product: Product)
}