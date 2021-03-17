package com.tamizna.bangkitlistfragment.learnFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tamizna.bangkitlistfragment.R

class DetailFragment : Fragment() {

    companion object {
        const val EXTRA_NAME = "EXTRA_NAME"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txtCategory: TextView = view.findViewById(R.id.txt_category)

        // receive data in fragment
        if (arguments != null) {
            val categoryName = arguments?.getString(EXTRA_NAME)
            txtCategory.text = categoryName
        }
    }
}