package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

/**
 * @author Ronnie Raymond on 01.10.2021
 */
class SecondFragment : Fragment() {

    private lateinit var button: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button = view.findViewById(R.id.button)
        button.setOnClickListener { }
    }

    companion object {
        fun newInstance(): SecondFragment {
            return SecondFragment()
        }
    }
}