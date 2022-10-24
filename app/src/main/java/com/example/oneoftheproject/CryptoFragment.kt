package com.example.oneoftheproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oneoftheproject.databinding.ActivityMainBinding
import com.example.oneoftheproject.databinding.FragmentCryptoBinding

class CryptoFragment : Fragment() {

    lateinit var adapter: CryptoAdapter
    lateinit var binding: FragmentCryptoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crypto, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCryptoBinding.inflate(layoutInflater)
        initRcView()
        adapter.submitList(
            listOf(
                Crypto("asd"),
                Crypto("aaa"),
                Crypto("lasdl")
            )
        )
    }

    private fun initRcView() = with(binding) {
        adapter = CryptoAdapter()
        cryptoRcView.layoutManager = LinearLayoutManager(activity)
        cryptoRcView.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = CryptoFragment()
            }
}