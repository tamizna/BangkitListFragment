package com.tamizna.bangkitlistfragment.learnViewBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamizna.bangkitlistfragment.databinding.ItemRowAnimalBinding

// using view binding in adapter
class AnimalAdapter(private var animals: List<String>) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    private lateinit var binding: ItemRowAnimalBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        binding = ItemRowAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animals[position])
    }

    override fun getItemCount(): Int = animals.size

    inner class AnimalViewHolder(view: ItemRowAnimalBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(animal: String) {
            binding.txtAnimalName.text = animal
        }
    }
}