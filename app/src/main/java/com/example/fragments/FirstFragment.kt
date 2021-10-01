package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment

/**
 * @author Ronnie Raymond on 01.10.2021
 */
class FirstFragment : Fragment() {

    private lateinit var editText: EditText
    private lateinit var publicApi: PublicApi

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        publicApi = activity as PublicApi

        editText = view.findViewById(R.id.edit_text)
        editText.addTextChangedListener { publicApi.setText(it.toString()) }
    }

    fun getText() = editText.text

    companion object {
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }
}