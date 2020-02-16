package com.example.frag2comm


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_1.view.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_1, container, false)

        // Communicating with the MainActivity to Pass the data to Fragment2
        var comm: Communicator = activity as Communicator

        rootView.enter_btn.setOnClickListener {
            comm.passDataCom(rootView.input_edittext.text.toString())
        }

        return rootView
    }


}
