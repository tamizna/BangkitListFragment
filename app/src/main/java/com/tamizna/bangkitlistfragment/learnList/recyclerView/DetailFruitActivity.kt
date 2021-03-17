package com.tamizna.bangkitlistfragment.learnList.recyclerView

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.tamizna.bangkitlistfragment.R

class DetailFruitActivity : AppCompatActivity() {

    private lateinit var txtFruitName: TextView
    private lateinit var txtFruitDesc: TextView
    private lateinit var imgFruit: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_fruit)

        txtFruitName = findViewById(R.id.txt_fruit_name)
        txtFruitDesc = findViewById(R.id.txt_fruit_desc)
        imgFruit = findViewById(R.id.img_fruit)

        // Receive data using parcelable
        val fruits = intent.getParcelableExtra<Fruit>("FRUIT_OBJECT") as Fruit

        txtFruitName.text = fruits.name
        txtFruitDesc.text = fruits.desc

        Glide.with(this)
            .load(fruits.photo)
            .into(imgFruit)
    }
}