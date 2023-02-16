package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    lateinit var bindingS : ActivitySearchBinding
    private val adapter = SearchAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingS= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(bindingS.root)
    }

    private fun init() {
        bindingS.apply{
            recycleView.layoutManager=GridLayoutManager(this@SearchActivity, 1)
            recycleView.adapter = adapter
        }
    }


}