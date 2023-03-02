package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityCorpusOneBinding

class CorpusOne : AppCompatActivity() {
    private lateinit var bindingCO : ActivityCorpusOneBinding
    private var room=0
    private var level=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCO = ActivityCorpusOneBinding.inflate(layoutInflater)
        setContentView(bindingCO.root)
        room = intent.getIntExtra("room", 0)
        bindingCO.button4.visibility = View.GONE
        bindingCO.button5.visibility = View.GONE
        bindingCO.imageView4.setImageResource(R.drawable.corp1_1)
        if(room==0){        changeLevel()
        }
        else{            bindingCO.button4.visibility = View.GONE
            bindingCO.button5.visibility = View.GONE}
        changeImage(room)
    }

    private fun changeImage(room : Int){
        when(room){
            //1-1
        0 -> bindingCO.imageView4.setImageResource(R.drawable.corp1_1)
         101-> bindingCO.imageView4.setImageResource(R.drawable.c101)
         102-> bindingCO.imageView4.setImageResource(R.drawable.c102__)
         103-> bindingCO.imageView4.setImageResource(R.drawable.c103)
         104-> bindingCO.imageView4.setImageResource(R.drawable.c104)
         105-> bindingCO.imageView4.setImageResource(R.drawable.c105)
         106-> bindingCO.imageView4.setImageResource(R.drawable.c106)
         107-> bindingCO.imageView4.setImageResource(R.drawable.c107)
         108-> bindingCO.imageView4.setImageResource(R.drawable.c108)
         109-> bindingCO.imageView4.setImageResource(R.drawable.c109)
         110-> bindingCO.imageView4.setImageResource(R.drawable.c110)
         111-> bindingCO.imageView4.setImageResource(R.drawable.c111)
         112-> bindingCO.imageView4.setImageResource(R.drawable.c112)
         113-> bindingCO.imageView4.setImageResource(R.drawable.c113)
         114-> bindingCO.imageView4.setImageResource(R.drawable.c114)
         115-> bindingCO.imageView4.setImageResource(R.drawable.c115)
         116-> bindingCO.imageView4.setImageResource(R.drawable.c116)
         117-> bindingCO.imageView4.setImageResource(R.drawable.c117)
         118-> bindingCO.imageView4.setImageResource(R.drawable.c118)
         119-> bindingCO.imageView4.setImageResource(R.drawable.c119__)
         120-> bindingCO.imageView4.setImageResource(R.drawable.c120)
         122-> bindingCO.imageView4.setImageResource(R.drawable.c122)
         123-> bindingCO.imageView4.setImageResource(R.drawable.c123___)
         3-> bindingCO.imageView4.setImageResource(R.drawable.mwc)
         2-> bindingCO.imageView4.setImageResource(R.drawable.wwc)
         6-> bindingCO.imageView4.setImageResource(R.drawable.wood)
         7-> bindingCO.imageView4.setImageResource(R.drawable.acthall)
         1-> bindingCO.imageView4.setImageResource(R.drawable.training)
         5-> bindingCO.imageView4.setImageResource(R.drawable.keys)
            //1-2
         201-> bindingCO.imageView4.setImageResource(R.drawable.c201)
         202-> bindingCO.imageView4.setImageResource(R.drawable.c202)
         203-> bindingCO.imageView4.setImageResource(R.drawable.c203)
         204-> bindingCO.imageView4.setImageResource(R.drawable.c204)
         205-> bindingCO.imageView4.setImageResource(R.drawable.c205)
         206-> bindingCO.imageView4.setImageResource(R.drawable.c206)
         666-> bindingCO.imageView4.setImageResource(R.drawable.c666)
         207-> bindingCO.imageView4.setImageResource(R.drawable.c207)
         208-> bindingCO.imageView4.setImageResource(R.drawable.c208)
         209-> bindingCO.imageView4.setImageResource(R.drawable.c209)
         210-> bindingCO.imageView4.setImageResource(R.drawable.c210)
         211-> bindingCO.imageView4.setImageResource(R.drawable.c211)
         212-> bindingCO.imageView4.setImageResource(R.drawable.c212)
         213-> bindingCO.imageView4.setImageResource(R.drawable.c213)
         214-> bindingCO.imageView4.setImageResource(R.drawable.c214)
         215-> bindingCO.imageView4.setImageResource(R.drawable.c215)
         216-> bindingCO.imageView4.setImageResource(R.drawable.c216)
            //1-3
            301-> bindingCO.imageView4.setImageResource(R.drawable.c301)
            302-> bindingCO.imageView4.setImageResource(R.drawable.c302)
            303-> bindingCO.imageView4.setImageResource(R.drawable.c303)
            304-> bindingCO.imageView4.setImageResource(R.drawable.c304)
            305-> bindingCO.imageView4.setImageResource(R.drawable.c305)
            306-> bindingCO.imageView4.setImageResource(R.drawable.c306)
            307-> bindingCO.imageView4.setImageResource(R.drawable.c307)
            308-> bindingCO.imageView4.setImageResource(R.drawable.c308)
            309-> bindingCO.imageView4.setImageResource(R.drawable.c309)
            310-> bindingCO.imageView4.setImageResource(R.drawable.c310)
         //1-4
            401-> bindingCO.imageView4.setImageResource(R.drawable.c401)
            402-> bindingCO.imageView4.setImageResource(R.drawable.c402)
            403-> bindingCO.imageView4.setImageResource(R.drawable.c403)
            404-> bindingCO.imageView4.setImageResource(R.drawable.c404)
        // -> bindingCO.imageView4.setImageResource(R.drawable.c)
        }
    }

    fun onClick(view: View){
        finish()
    }


    private fun changeLevel(){
        //while(true)
        when (level) {
            1 -> {
                bindingCO.button4.visibility = View.GONE
                bindingCO.button5.visibility = View.VISIBLE
                bindingCO.button5.text = "Поверх 2"
                bindingCO.button5.setOnClickListener {
                    bindingCO.imageView4.setImageResource(R.drawable.corp1_2)
                    level=2
                    changeLevel()
                }}
            2 -> {
                bindingCO.button4.visibility = View.VISIBLE
                bindingCO.button5.visibility = View.VISIBLE
                bindingCO.button4.text = "Поверх 1"
                bindingCO.button5.text = "Поверх 3"
                bindingCO.button5.setOnClickListener {
                    bindingCO.imageView4.setImageResource(R.drawable.corp1_3)
                    level=3
                    changeLevel()
                }
                bindingCO.button4.setOnClickListener{
                    bindingCO.imageView4.setImageResource(R.drawable.corp1_1)
                    level=1
                    changeLevel()
                }
            }
            3 -> {
                bindingCO.button4.visibility = View.VISIBLE
                bindingCO.button5.visibility = View.VISIBLE
                bindingCO.button4.text = "Поверх 2"
                bindingCO.button5.text = "Поверх 4"
                bindingCO.button5.setOnClickListener{
                    bindingCO.imageView4.setImageResource(R.drawable.corp1_4)
                    level=4
                    changeLevel()
                }
                bindingCO.button4.setOnClickListener{
                    bindingCO.imageView4.setImageResource(R.drawable.corp1_2)
                    level=2
                    changeLevel()
                }
            }
            4 -> {
                bindingCO.button4.visibility = View.VISIBLE
                bindingCO.button5.visibility = View.GONE
                bindingCO.button4.text = "Поверх 2"
                bindingCO.button4.setOnClickListener{
                    bindingCO.imageView4.setImageResource(R.drawable.corp1_3)
                    level=3
                    changeLevel()
                }
            }
        }
    }
}