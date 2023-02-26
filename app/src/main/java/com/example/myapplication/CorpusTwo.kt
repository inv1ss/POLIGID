package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityCorpusTwoBinding


class CorpusTwo : AppCompatActivity() {
    private lateinit var bindingCT : ActivityCorpusTwoBinding
    private var room=-1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCT = ActivityCorpusTwoBinding.inflate(layoutInflater)
        setContentView(bindingCT.root)
        room = getIntent().getIntExtra("room", 0)
    }

    fun onClick(view: View){
        finish()
    }

    fun changeImage(room : Int){
        when(room){

        }
    }


}