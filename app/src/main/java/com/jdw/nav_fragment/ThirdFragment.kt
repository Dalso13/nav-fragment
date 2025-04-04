package com.jdw.nav_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class ThirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            // 화면 전환
            it.findNavController().navigate(R.id.action_thirdFragment_to_firstFragment22)
        }
        view.findViewById<Button>(R.id.btn2).setOnClickListener {
            // 화면 전환
            it.findNavController().navigate(R.id.action_thirdFragment_to_sencondFragment22)
        }

        return view
    }
}

