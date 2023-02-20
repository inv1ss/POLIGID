package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View.OnKeyListener
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.databinding.ActivitySearchBinding


class SearchActivity : AppCompatActivity() {
    private lateinit var bindingS : ActivitySearchBinding
    var room = 0
    private val adapter = SearchAdapter()
    private val nameB: List<String>
        get() = listOf(
            getString(R.string.library),
            getString(R.string.woman_wc),
            getString(R.string.man_wc),
            getString(R.string.mechanic),
            getString(R.string.cloth),
            getString(R.string.wood),
            getString(R.string.act_hall),
            getString(R.string.eat_room),
            getString(R.string.health_room),
            getString(R.string.lection_hall),
            getString(R.string.accountant),
            getString(R.string.department),
            getString(R.string.director),
            getString(R.string.gym),
            getString(R.string.teachers)
        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingS= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(bindingS.root)
        init()
        bindingS.SearchEdit.setOnKeyListener { view, i, keyEvent ->
            if(i==KeyEvent.KEYCODE_ENTER && keyEvent.action== KeyEvent.ACTION_UP) {
                if(bindingS.SearchEdit.text.toString().toInt()!=null)
                    room = 1//bindingS.SearchEdit.text.toString().toInt()
                else
                    Toast.makeText(this, "Введіть номер приміщення", Toast.LENGTH_SHORT).show()
     //           Toast.makeText(this, bindingS.SearchEdit.text.toString(), Toast.LENGTH_SHORT).show()
                finish()
                return@setOnKeyListener true
            }
            else {
                room = 1//intent.getStringExtra("txt").toString().toInt()
                false
            }

        }
      //  intent.putExtra("actroom", room.toString())
       // setResult(RESULT_OK, intent)
       // val i = Intent(this, MainActivity::class.java)
       // i.putExtra("room", room)

    }


    private fun init() {
        val search = ArrayList<Search>()
        for(index in 0 until (nameB.size-1)) {
            var txt= nameB[index]
            search.add(index, Search(txt))
        }
        bindingS.apply{
            recycleView.layoutManager=GridLayoutManager(this@SearchActivity, 1)
            recycleView.adapter = adapter
            adapter.createList(search)
            }
        }
    }