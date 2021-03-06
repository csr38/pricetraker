package com.example.pricetraker.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pricetraker.R
import com.example.pricetraker.data.DataProductoHorizontal
import com.example.pricetraker.recyclerview.viewholder.ProductoHorizontalViewHolder

class ProductoAdapterHorizontal (private val productoList: List<DataProductoHorizontal>, private val onClickListener: (DataProductoHorizontal)->Unit) : RecyclerView.Adapter<ProductoHorizontalViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ProductoHorizontalViewHolder {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        return ProductoHorizontalViewHolder(layoutInflater.inflate(R.layout.item_producto_horizontal, viewGroup, false))
    }

    override fun onBindViewHolder(viewHolder: ProductoHorizontalViewHolder, i: Int) {
       val item = productoList[i]
        viewHolder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = productoList.size




}

