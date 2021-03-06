package com.example.rockpaperscissor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.rockpaperscissor.databinding.FragmentHelpBinding
import com.example.rockpaperscissor.databinding.FragmentOptionsBinding

class OptionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentOptionsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_options, container, false)

        return binding.root
    }

}