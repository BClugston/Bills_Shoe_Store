package com.example.android.bills_shoe_store.storelist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.bills_shoe_store.R
import com.example.android.bills_shoe_store.databinding.FragmentStoreBinding


class StoreFragment : Fragment() {


    private lateinit var binding: FragmentStoreBinding

    private val viewModel: StoreViewModel by lazy {
        ViewModelProvider(this).get(StoreViewModel::class.java)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate view and obtain an instance of the binding class
        binding = FragmentStoreBinding.inflate(inflater)

        binding.storeViewModel = viewModel

        return binding.root
    }


}