package com.example.fragmentseactivities.beta1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragmentseactivities.R


class BetaOneFragment : Fragment() {

    private var btnToFragmentTwo: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beta_one, container, false)
        btnToFragmentTwo = view?.findViewById(R.id.btnToBeta2)
        btnToFragmentTwo?.setOnClickListener {
            onClickToFramentTwo()
        }
        return view
    }

    fun onClickToFramentTwo () {
        findNavController().navigate(R.id.action_betaOneFragment_to_betaTwoFragment)
    }

}