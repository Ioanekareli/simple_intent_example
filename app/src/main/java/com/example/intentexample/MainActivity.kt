package com.example.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
    }

    fun setData(){
        binding.confirmBtn.setOnClickListener {
            val name = binding.Name.text.toString()
            val age = binding.Age.text.toString().toInt()
            val country = binding.Country.text.toString()
            val person = Person(name,age,country)

            Intent(this,SecondActivity::class.java).also { PersonData ->
                PersonData.putExtra("Extra_Person",person)
                startActivity(PersonData)
            }
        }
    }
}