package com.tamizna.bangkitlistfragment.learnList.listView

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tamizna.bangkitlistfragment.R

class ListViewActivity : AppCompatActivity() {

    // Data source
    private val fruits = arrayOf(
        "Apple",
        "Banana",
        "Cherries",
        "Grapes",
        "Mango",
        "Papaya",
        "Strawberry",
        "Watermelon"
    )

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        listView = findViewById(R.id.lv_fruit)

        // define adapter for list view (set item's layout and data source)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            fruits
        )

        // set adapter to list view
        listView.adapter = adapter

        // set on click listener in list view
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                this,
                "${fruits[position]} clicked",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}