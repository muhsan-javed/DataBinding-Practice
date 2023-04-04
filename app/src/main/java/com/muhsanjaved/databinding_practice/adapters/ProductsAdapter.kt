package com.muhsanjaved.databinding_practice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.RecyclerView
import com.muhsanjaved.databinding_practice.databinding.ProductItemBinding
import com.muhsanjaved.databinding_practice.interfaces.IMainActivity
import com.muhsanjaved.databinding_practice.models.Product

class ProductsAdapter(private val context: Context, private var dataList: MutableList<Product>) :
    RecyclerView.Adapter<ProductsAdapter.BindingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
    /*    val rootView = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        val rootView = ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)*/
        val rootView : ViewDataBinding =
            ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return BindingViewHolder(rootView)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val product = dataList[position]

//        holder.itemBinding.productItem = product
        holder.itemBinding.setVariable(BR.productItem, product)
        holder.itemBinding.setVariable(BR.listener, context as IMainActivity)
        holder.itemBinding.executePendingBindings()

      /*  holder.tvName.text = product.name
        holder.tvPrice.text = "${product.price}$ "
        holder.tvRating.rating = product.rating
        holder.tvNumRating.text = "(${product.totalRatings})"

        try {
            val bitmap = BitmapFactory.decodeStream(context.assets.open(product.image))
            holder.ivProduct.setImageBitmap(bitmap)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        holder.ivSale.visibility = if (product.salePrice > 0) View.VISIBLE else View.GONE*/
    }

    fun updateDataList(data: List<Product>){
        dataList.clear()
        dataList.addAll(data)
        notifyDataSetChanged()
    }
//    class BindingViewHolder(val itemBinding:ProductItemBinding) : RecyclerView.ViewHolder(itemBinding.root)
    class BindingViewHolder(val itemBinding:ViewDataBinding) : RecyclerView.ViewHolder(itemBinding.root)



  /*  class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        val tvName = itemView.findViewById<TextView>(R.id.tv_name)
        val tvPrice = itemView.findViewById<TextView(R.id.tv_price)
        val tvRating = itemView.findViewById<RatingBar(R.id.rating_bar)
        val tvNumRating = itemView.findViewById<TextView>(R.id.tv_num_rating)

        val ivProduct = itemView.findViewById<ImageView>(R.id.iv_product)
        val ivSale = itemView.findViewById<ImageView>(R.id.iv_product_sale)

       */
    /* val tvName = itemView.tv_name
        val tvPrice = itemView.tv_price
        val tvRating = itemView.rating_bar
        val tvNumRating = itemView.tv_num_rating
        val ivProduct = itemView.iv_product
        val ivSale = itemView.iv_product_sale
*//*
    }*/
}