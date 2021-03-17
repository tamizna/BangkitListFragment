package com.tamizna.bangkitlistfragment.learnFragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tamizna.bangkitlistfragment.R

class ShowFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_fragment)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.frame_container, HomeFragment())
            .commit()
    }
}