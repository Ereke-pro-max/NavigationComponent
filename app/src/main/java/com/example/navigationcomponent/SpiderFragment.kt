package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentSpiderBinding

class SpiderFragment : Fragment() {

    private lateinit var binding: FragmentSpiderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpiderBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCapitanFragmentForSpider.setOnClickListener {
            findNavController().navigate(R.id.action_spiderFragment_to_capitanFragment)
        }

        binding.btnIronManFragmentForSpider.setOnClickListener {
            findNavController().navigate(R.id.action_spiderFragment_to_ironFragment)
        }

        binding.btnHulkFragmentForSpider.setOnClickListener {
            findNavController().navigate(R.id.action_spiderFragment_to_hulkFragment)
        }

        binding.btnVenomFragmentForSpider.setOnClickListener {
            findNavController().navigate(R.id.action_spiderFragment_to_venomFragment)
        }

        binding.imgSpiderman.setImageResource(R.drawable.spider)
    }

}