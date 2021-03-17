package com.tamizna.bangkitlistfragment.learnViewBinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tamizna.bangkitlistfragment.databinding.ActivityAnimalBinding

class AnimalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animals = listOf("Tiger", "Cat", "Dog", "Cow", "Rabbit", "Snake")

        binding.rvAnimal.apply {
            layoutManager = LinearLayoutManager(this@AnimalActivity)
            adapter = AnimalAdapter(animals)
        }
    }
}