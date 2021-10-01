package com.example.fragments

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity(), PublicApi {

    private var thirdFragment: ThirdFragment? = null
    private var root: ViewGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        root = findViewById(R.id.root_view)

        supportFragmentManager.beginTransaction()
            .add(R.id.first_fragment_container_view_tag, FirstFragment.newInstance())
            .commitAllowingStateLoss()
    }

    override fun onClick() {
        if (thirdFragment == null) {
            val text = supportFragmentManager.findFragmentById(R.id.first_fragment_container_view_tag)
            val viewGroup = FragmentContainerView(this)
            viewGroup.layoutParams =
                ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            viewGroup.id = R.id.third_fragment_id

            root?.addView(viewGroup)
            thirdFragment = ThirdFragment.newInstance(text.getText())
            supportFragmentManager.beginTransaction()
                .add(R.id.third_fragment_id, thirdFragment!!)
                .commit()
        }
    }

    override fun setText(text: String) {
        thirdFragment?.setText(text)
    }

    override fun getText(): String {
        TODO("Not yet implemented")
    }
}