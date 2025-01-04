package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentVenomBinding

class VenomFragment : Fragment() {

    private lateinit var binding:FragmentVenomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVenomBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCapitanFragmentForVenom.setOnClickListener {
            findNavController().navigate(R.id.action_venomFragment_to_capitanFragment)
        }

        binding.btnIronFragmentForVenom.setOnClickListener {
            findNavController().navigate(R.id.action_venomFragment_to_ironFragment)
        }

        binding.btnHulkFragmentForVenom.setOnClickListener {
            findNavController().navigate(R.id.action_venomFragment_to_hulkFragment)
        }

        binding.btnSiderFragmentForVenom.setOnClickListener {
            findNavController().navigate(R.id.action_venomFragment_to_spiderFragment)
        }

        binding.imgVenom.setImageResource(R.drawable.venom)
    }
}