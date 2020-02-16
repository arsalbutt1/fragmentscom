package com.example.frag2comm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set replace Main Activity content with the Fragment1 content
        val Fragment1 = Fragment1()
        supportFragmentManager.beginTransaction().add(R.id.content_id, Fragment1).commit()

    }


    override fun passDataCom(editext_input: String) {

        // use bundle object to pass data from one fragment to the other
        val bundle = Bundle()
        bundle.putString("input_txt", editext_input)

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        val frag2 = Fragment2()
        frag2.arguments = bundle

        transaction.replace(R.id.content_id, frag2)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
