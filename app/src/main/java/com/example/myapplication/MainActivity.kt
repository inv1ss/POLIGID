package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingM : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingM= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingM.root)
    }

    fun search(){
      //  bindingM.searchb.setOnClickListener(){
            //val intent = Intent(Search1Activity::class.java)

        }
    }
