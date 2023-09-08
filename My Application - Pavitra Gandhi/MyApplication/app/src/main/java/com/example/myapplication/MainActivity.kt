package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }
    private fun initUI(){

        binding.fabBack.setOnClickListener{}
        binding.etForgotPassword.setOnClickListener{}
        binding.btnSignIn.setOnClickListener{}
        binding.etSignup.setOnClickListener{}

    }

}