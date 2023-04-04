package com.muhsanjaved.databinding_practice.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muhsanjaved.databinding_practice.adapters.ProductsAdapter
import com.muhsanjaved.databinding_practice.models.Product


@BindingAdapter("bindList")
fun bindRecyclerViewList(view:RecyclerView, dataList:List<Product>) {

    if(dataList.isEmpty()){
        return
    }
//    val layoutManager: RecyclerView.LayoutManager? = view.layoutManager
    val layoutManager = view.layoutManager
    if (layoutManager == null){
//        layoutManager = GridLayoutManager(view.context, 2)
//        view.layoutManager = layoutManager
        view.layoutManager = GridLayoutManager(view.context, 2)
    }
//    val adapter: RecyclerView.Adapter<(raw) RecyclerView.ViewHolder!>? = view.adapter
    var adapter = view.adapter
//    var adapter : ProductsAdapter = view.adapter as ProductsAdapter

    if (adapter == null){
        adapter = ProductsAdapter(view.context,dataList.toMutableList())
        view.adapter = adapter
    }

    //adapter.updateDataList(dataList)
}