package com.tamizna.bangkitlistfragment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.tamizna.bangkitlistfragment.learnFragment.ShowFragmentActivity
import com.tamizna.bangkitlistfragment.learnList.listView.ListViewActivity
import com.tamizna.bangkitlistfragment.learnList.recyclerView.RvActivity
import com.tamizna.bangkitlistfragment.learnViewBinding.AnimalActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnGoToListView: Button
    private lateinit var btnGoToRV: Button
    private lateinit var btnGoToFragment: Button
    private lateinit var btnGoToViewBinding: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoToListView = findViewById(R.id.btn_list_view)
        btnGoToRV = findViewById(R.id.btn_recycler_view)
        btnGoToFragment = findViewById(R.id.btn_fragment)
        btnGoToViewBinding = findViewById(R.id.btn_view_binding)

        btnGoToListView.setOnClickListener {
            startActivity(Intent(this, ListViewActivity::class.java))
        }

        btnGoToRV.setOnClickListener {
            startActivity(Intent(this, RvActivity::class.java))
        }

        btnGoToFragment.setOnClickListener {
            startActivity(Intent(this, ShowFragmentActivity::class.java))
        }

        btnGoToViewBinding.setOnClickListener {
            startActivity(Intent(this, AnimalActivity::class.java))
        }
    }
}