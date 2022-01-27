package com.example.intentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getPersonData()
    }

    fun getPersonData(){
        val person = intent.getSerializableExtra("Extra_Person") as Person
        binding.textView.text = "Your Name Is ${person.name},Age is ${person.age} and country ${person.country}"
    }
}