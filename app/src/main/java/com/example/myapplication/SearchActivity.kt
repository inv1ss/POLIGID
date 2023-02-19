package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    private lateinit var bindingS : ActivitySearchBinding
    private val adapter = SearchAdapter()
    private val nameB = listOf(
        "saas",
        "asas"
//        getString(R.string.library),
//        getString(R.string.woman_wc),
//        getString(R.string.man_wc),
//        getString(R.string.mechanic),
//        getString(R.string.cloth),
//        getString(R.string.wood),
//        getString(R.string.act_hall),
//        getString(R.string.eat_room),
 //       getString(R.string.health_room),
 //       getString(R.string.lection_hall)
    )





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingS= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(bindingS.root)
        init()
       // bindingS.recycleView.adapter.
    }


    private fun init() {
        val search = ArrayList<Search>()
        for(index in 0 .. (nameB.size-1)) {
            search.add(index, Search(nameB[index]))
        }
        bindingS.apply{
            recycleView.layoutManager=GridLayoutManager(this@SearchActivity, 1)
            recycleView.adapter = adapter
            adapter.createList(search)
            }
        }
    }


