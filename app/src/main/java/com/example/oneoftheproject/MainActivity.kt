package com.example.oneoftheproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oneoftheproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: CryptoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        initRcView()
        adapter.submitList(listOf(Crypto("kekw")))
        binding.button.setOnClickListener {
            adapter.submitList(
                listOf(
                    Crypto("asd"),
                    Crypto("aaa"),
                    Crypto("lasdl")
                )
            )
        }
    }

    private fun initRcView() = with(binding) {
        adapter = CryptoAdapter()
        cryptoRcView.layoutManager = LinearLayoutManager(this@MainActivity)
        cryptoRcView.adapter = adapter
    }


}