package com.tamizna.bangkitlistfragment.learnList.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tamizna.bangkitlistfragment.R
import de.hdodenhof.circleimageview.CircleImageView


class ListFruitAdapter(private val listFruits: List<Fruit>, private val onClick: (Fruit) -> Unit) :
    RecyclerView.Adapter<ListFruitAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_fruit, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listFruits[position])
    }

    override fun getItemCount(): Int = listFruits.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var txtFruitName: TextView = itemView.findViewById(R.id.txt_fruit_name)
        private var txtFruitDesc: TextView = itemView.findViewById(R.id.txt_fruit_desc)
        private var imgFruit: CircleImageView = itemView.findViewById(R.id.img_fruit)

        fun bind(fruit: Fruit) {
            Glide.with(itemView.context)
                .load(fruit.photo)
                .into(imgFruit)
            txtFruitName.text = fruit.name
            txtFruitDesc.text = fruit.desc

            itemView.setOnClickListener {
                onClick(fruit)
            }
        }
    }
}