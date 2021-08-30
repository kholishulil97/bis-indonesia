package com.example.bisindonesia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBusAdapter(private val listBus : ArrayList<Bus>) : RecyclerView.Adapter<ListBusAdapter.ListViewHolder>() {
    interface  OnItemClickCallback{
        fun onItemClicked(data: Bus)
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvBuilder: TextView = itemView.findViewById(R.id.tv_item_builder)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_bus, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBus.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val bus = listBus[position]

        Glide.with(holder.itemView.context)
            .load(bus.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = bus.body
        holder.tvBuilder.text = bus.builderName

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listBus[holder.adapterPosition]) }
    }
}