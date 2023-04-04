package com.muhsanjaved.databinding_practice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhsanjaved.databinding_practice.R
import com.muhsanjaved.databinding_practice.databinding.FragmentProductListBinding
import com.muhsanjaved.databinding_practice.models.DataProvider

class ProductListFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding: FragmentProductListBinding  = FragmentProductListBinding.inflate(inflater, container, false)


        binding.dataList = DataProvider.productList

        return binding.root
    }

}