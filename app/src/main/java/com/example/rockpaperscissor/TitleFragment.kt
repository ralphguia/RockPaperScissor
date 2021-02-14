package com.example.rockpaperscissor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.rockpaperscissor.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentTitleBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        binding.buttonHelp.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_helpFragment)
        }

        binding.buttonOptions.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_optionsFragment)
        }

        return binding.root
    }

}