package com.example.androidstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class AnxiousFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_anxious, container, false)
        val backButton: ImageButton = view.findViewById(R.id.back_button)


        backButton.setOnClickListener {

            activity?.supportFragmentManager?.popBackStack()
        }

        return view
    }
}