package com.example.livedemo_fragmentss01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyInfoFragment : Fragment()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val view = inflater.inflate(R.layout.my_informative_fragment, container, false)

        return view
    }

    override fun onStart() {
        super.onStart()
    }
}