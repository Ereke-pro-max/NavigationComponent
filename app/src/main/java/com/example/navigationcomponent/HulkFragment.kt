package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentHulkBinding

class HulkFragment : Fragment() {

    private lateinit var binding: FragmentHulkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHulkBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCapitanFragmentForHulk.setOnClickListener {
            findNavController().navigate(R.id.action_hulkFragment_to_capitanFragment)
        }

        binding.btnIronManFragmentForHulk.setOnClickListener {
            findNavController().navigate(R.id.action_hulkFragment_to_ironFragment)
        }

        binding.btnSpiderManForHulk.setOnClickListener {
            findNavController().navigate(R.id.action_hulkFragment_to_spiderFragment)
        }

        binding.btnVenomFragmentForHulk.setOnClickListener {
            findNavController().navigate(R.id.action_hulkFragment_to_venomFragment)
        }

        binding.imgHulk.setImageResource(R.drawable.hulk)
    }
}