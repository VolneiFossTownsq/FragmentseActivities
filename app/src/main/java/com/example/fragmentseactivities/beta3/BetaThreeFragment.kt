package com.example.fragmentseactivities.beta3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmentseactivities.R
import android.app.Activity as Activity


class BetaThreeFragment : Fragment() {

    private var btnToCloseFragment: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beta_three, container, false)
        btnToCloseFragment = view?.findViewById(R.id.btnToReturnMain)
        btnToCloseFragment?.setOnClickListener {
            returnToMainActivity()
        }

        return view
    }

    fun returnToMainActivity(){
            requireActivity().finish()
    }
}