package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

/**
 * @author Ronnie Raymond on 01.10.2021
 */
class ThirdFragment : Fragment() {

    private lateinit var textView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.third_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        textView = view.findViewById(R.id.text_view)
        textView.text = arguments?.getString(TEXT_KEY)
    }

    fun setText(text: String) {
        textView.text = text
    }

    companion object {
        private const val TEXT_KEY = "TEXT_KEY"

        fun newInstance(text: String): ThirdFragment {
            return ThirdFragment().apply {
                arguments = bundleOf(TEXT_KEY to text)
            }
        }
    }
}