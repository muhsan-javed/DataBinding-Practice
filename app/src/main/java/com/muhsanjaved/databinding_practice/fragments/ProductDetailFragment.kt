package com.muhsanjaved.databinding_practice.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.muhsanjaved.databinding_practice.databinding.FragmentProductDetailBinding
import com.muhsanjaved.databinding_practice.interfaces.IMainActivity
import com.muhsanjaved.databinding_practice.models.Product
import com.muhsanjaved.databinding_practice.viewModels.MainViewModel

class ProductDetailFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = FragmentProductDetailBinding.inflate(inflater, container, false)

        //val viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]

        //binding.product = viewModel.getProduct()

        val product = arguments?.getParcelable<Product>("product_key")

        binding.product = product!!

        binding.listener = context as IMainActivity

        return binding.root
    }

  /*  //    fun runCode(v: View?) {
//    fun runCode(v: View?, product: Product) {
    fun runCode(product: Product) : Boolean{
            //        binding.listener = this
        Toast.makeText(context,"${product.name} is Clicked Run Code", Toast.LENGTH_SHORT).show()
        return true
    }*/

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