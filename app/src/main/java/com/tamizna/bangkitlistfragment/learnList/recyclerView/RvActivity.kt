package com.tamizna.bangkitlistfragment.learnList.recyclerView

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tamizna.bangkitlistfragment.R

class RvActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv)

        // data source
        val list = listOf(
            Fruit("Apple", "This is Apple", R.drawable.ic_apple),
            Fruit("Banana", "This is Banana", R.drawable.ic_bananas),
            Fruit("Grapes", "This is Grapes", R.drawable.ic_grapes),
            Fruit("Guava", "This is Guava", R.drawable.ic_guava),
            Fruit("Melon", "This is Melon", R.drawable.ic_melon),
        )

        val rvFruits: RecyclerView =
            findViewById(R.id.rv_fruits)

        // define adapter for recycler view with data source & on click listener function
        val listFruitAdapter = ListFruitAdapter(list) {
            // handle on click listener using lambda
                fruit ->
            Toast.makeText(this, "You choose ${fruit.name}", Toast.LENGTH_SHORT).show()

            // send data in recycler view using parcelable
            val intent = Intent(this, DetailFruitActivity::class.java)
            intent.putExtra("FRUIT_OBJECT", fruit)
            startActivity(intent)
        }

        // set adapter and layout manager for recycler view
        rvFruits.apply {
            layoutManager = LinearLayoutManager(this@RvActivity)
            adapter = listFruitAdapter
        }
    }
}