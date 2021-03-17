package com.tamizna.bangkitlistfragment.learnFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tamizna.bangkitlistfragment.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button: Button = view.findViewById(R.id.btn_click_me)
        button.setOnClickListener {
            Toast.makeText(activity, "Hello", Toast.LENGTH_SHORT).show()

            val detailCategoryFragment = DetailFragment()
            val bundle = Bundle()
            bundle.putString(DetailFragment.EXTRA_NAME, "Lifestyle")
            detailCategoryFragment.arguments = bundle


            childFragmentManager.beginTransaction().apply {
                replace(
                    R.id.child_frame_layout,
                    detailCategoryFragment,
                    DetailFragment::class.java.simpleName
                )
                addToBackStack(null)
                commit()
            }
        }

    }
}