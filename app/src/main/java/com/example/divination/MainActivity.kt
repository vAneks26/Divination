package com.example.divination

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.divination.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Divination.setOnClickListener {
            binding.Divination.text= getDivination()
        }
    }
    private fun getDivination(): String{
        return resources.getStringArray(R.array.Divination)[randomNumber()]
    }
private fun randomNumber(): Int{
    val size = resources.getStringArray(R.array.Divination).size -1
    return (0..size).random()
}

}