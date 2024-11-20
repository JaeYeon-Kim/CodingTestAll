package com.kjy.kotlingrammer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kjy.kotlingrammer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var liveCount : Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener(onClick)
        binding.btnMinus.setOnClickListener(onClick)

        binding.tvLiveData.text = liveCount.toString()
        binding.btnMinus.isClickable = false
    }


    private val onClick = View.OnClickListener { v ->
        when(v) {
            binding.btnPlus -> {
                liveCount = liveCount.inc()
                binding.tvLiveData.text = liveCount.toString()
            }

            binding.btnMinus -> {
                liveCount = liveCount.dec()
                binding.tvLiveData.text = liveCount.toString()
            }
        }

        when(liveCount) {
            1 -> binding.btnMinus.isClickable = false
            in 2..5 ->  {
                binding.btnMinus.isClickable = true
                binding.btnPlus.isClickable = true
            }
            else -> {
                binding.btnPlus.isClickable = false
            }
        }
    }
}