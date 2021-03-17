package com.tamizna.bangkitlistfragment.learnViewBinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tamizna.bangkitlistfragment.databinding.ActivityAnimalBinding

class AnimalActivity : AppCompatActivity() {

    // view binding initialization at this activity
    private lateinit var binding: ActivityAnimalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inflate layout for this activity using view binding
        binding = ActivityAnimalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animals = listOf("Tiger", "Cat", "Dog", "Cow", "Rabbit", "Snake")

        // access UI component in XML layout using view binding
        binding.rvAnimal.apply {
            layoutManager = LinearLayoutManager(this@AnimalActivity)
            adapter = AnimalAdapter(animals)
        }
    }
}