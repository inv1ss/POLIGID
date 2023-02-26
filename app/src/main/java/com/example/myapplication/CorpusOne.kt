package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myapplication.databinding.ActivityCorpusOneBinding
import com.example.myapplication.databinding.ActivityCorpusTwoBinding

class CorpusOne : AppCompatActivity() {
    private lateinit var bindingCO : ActivityCorpusOneBinding
    var room=-1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCO = ActivityCorpusOneBinding.inflate(layoutInflater)
        setContentView(bindingCO.root)
        room = getIntent().getIntExtra("room", 0)
        changeImage(room)
    }

    fun changeImage(room : Int){
        when(room){
            //1-1
        -1 -> bindingCO.imageView4.setImageResource(R.drawable.corp1_1)
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
         119-> bindingCO.imageView4.setImageResource(R.drawable.c119__)
         120-> bindingCO.imageView4.setImageResource(R.drawable.c120)
         122-> bindingCO.imageView4.setImageResource(R.drawable.c122)
         123-> bindingCO.imageView4.setImageResource(R.drawable.c123___)
         3-> bindingCO.imageView4.setImageResource(R.drawable.mwc)
         2-> bindingCO.imageView4.setImageResource(R.drawable.wwc)
         6-> bindingCO.imageView4.setImageResource(R.drawable.wood)
         1-> bindingCO.imageView4.setImageResource(R.drawable.training)
            //1-2
         201-> bindingCO.imageView4.setImageResource(R.drawable.c201)
         202-> bindingCO.imageView4.setImageResource(R.drawable.c202)
         203-> bindingCO.imageView4.setImageResource(R.drawable.c203)
         204-> bindingCO.imageView4.setImageResource(R.drawable.c204)
         205-> bindingCO.imageView4.setImageResource(R.drawable.c205)
         206-> bindingCO.imageView4.setImageResource(R.drawable.c206)
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

}