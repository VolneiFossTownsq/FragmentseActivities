package com.example.fragmentseactivities.beta2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragmentseactivities.R

class BetaTwoFragment : Fragment() {

    private var btnToFragmentThree: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beta_two, container, false)
        btnToFragmentThree = view?.findViewById(R.id.btnToBeta3)
        btnToFragmentThree?.setOnClickListener {
            onClickToFragmentThree()
        }
        return view
    }

    fun onClickToFragmentThree(){
        findNavController().navigate(R.id.action_betaTwoFragment_to_betaThreeFragment)
    }

}