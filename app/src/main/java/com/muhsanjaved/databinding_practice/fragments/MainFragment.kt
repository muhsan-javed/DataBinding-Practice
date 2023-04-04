package com.muhsanjaved.databinding_practice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.muhsanjaved.databinding_practice.databinding.FragmentMainBinding
import com.muhsanjaved.databinding_practice.viewModels.MainViewModel

class MainFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = FragmentMainBinding.inflate(inflater, container, false)

        val viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]

        binding.product = viewModel.getProduct()
        return binding.root
    }

  /*
  //        setData(binding.root, viewModel.getProduct())
    private fun setData(rootView: View, product: Product) {
       *//* rootView.tv_name.text = product.name
        rootView.tv_price.text = "${product.price}$"
        rootView.tv_description.text = product.description
        rootView.tv_num_rating.text = "(${product.totalRatings})"

        Log.d("MyTag", "inflateViewAndSetData: desc: ${product.description}")*//*

        //rootView.iv_product_sale.visibility = if (product.salePrice > 0.0) View.VISIBLE else View.GONE
        //rootView.iv_product.setImageBitmap(getBitmapFromAssets(product.image))

    }

    private fun getBitmapFromAssets(fileName: String): Bitmap? {
        return try {
            BitmapFactory.decodeStream(context?.assets?.open(fileName))
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }*/
}