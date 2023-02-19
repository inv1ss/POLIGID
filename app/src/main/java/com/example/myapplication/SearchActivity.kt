package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    lateinit var bindingS : ActivitySearchBinding
    private val adapter = SearchAdapter()
    private val nameB = listOf<String>(
        "@string/library",
        "@string/woman_wc",
        "@string/man_wc",
        "@string/mechanic",
        "@string/cloth",
        "@string/wood",
        "@string/act_hall",
        "@string/eat_room",
        "@string/health_room",
        "@string/lection_hall")





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingS= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(bindingS.root)
        init()
    }

    private fun init() {
        val search = ArrayList<Search>()
        for(index in 0..(nameB.size-1)) {
            search.add(index, Search(nameB[index]))
        }
        bindingS.apply{
            recycleView.layoutManager=GridLayoutManager(this@SearchActivity, 1)
            recycleView.adapter = adapter
            adapter.createList(search)
            }
        }
    }


