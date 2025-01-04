package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentCapitanBinding

class CapitanFragment : Fragment() {

    private lateinit var binding: FragmentCapitanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCapitanBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnIronFragmentForCapitan.setOnClickListener {
            findNavController().navigate(R.id.action_capitanFragment_to_ironFragment)
        }

        binding.btnSpidermanForCapitan.setOnClickListener {
            findNavController().navigate(R.id.action_capitanFragment_to_spiderFragment)
        }

        binding.btnChangeHulkFragmentForCapitan.setOnClickListener {
            findNavController().navigate(R.id.action_capitanFragment_to_hulkFragment)
        }

        binding.btnVenomFragmentForCapitan.setOnClickListener {
            findNavController().navigate(R.id.action_capitanFragment_to_venomFragment)
        }

        binding.imgCapitan.setImageResource(R.drawable.capitan)

    }

}