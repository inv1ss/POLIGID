package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityCorpusTwoBinding


class CorpusTwo : AppCompatActivity() {
    private lateinit var bindingCT : ActivityCorpusTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCT = ActivityCorpusTwoBinding.inflate(layoutInflater)
        setContentView(bindingCT.root)
    }
}