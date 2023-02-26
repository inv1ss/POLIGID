package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityCorpusTwoBinding


class CorpusTwo : AppCompatActivity() {
    private lateinit var bindingCT : ActivityCorpusTwoBinding
    private var room=0
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
        0->bindingCT.imageView2.setImageResource(R.drawable.corp2_1)
        127->bindingCT.imageView2.setImageResource(R.drawable.c127)
        128->bindingCT.imageView2.setImageResource(R.drawable.c218)
        129->bindingCT.imageView2.setImageResource(R.drawable.c129)
        -8->bindingCT.imageView2.setImageResource(R.drawable.eat)
        -4->bindingCT.imageView2.setImageResource(R.drawable.mehanic)
            //2-2
        217->bindingCT.imageView2.setImageResource(R.drawable.c217)
        218->bindingCT.imageView2.setImageResource(R.drawable.c218)
        220->bindingCT.imageView2.setImageResource(R.drawable.c220)
        221->bindingCT.imageView2.setImageResource(R.drawable.c221)
        222->bindingCT.imageView2.setImageResource(R.drawable.c222)
        223->bindingCT.imageView2.setImageResource(R.drawable.c223)
        225->bindingCT.imageView2.setImageResource(R.drawable.c225)
        228->bindingCT.imageView2.setImageResource(R.drawable.c228)
        229->bindingCT.imageView2.setImageResource(R.drawable.c229)
        230->bindingCT.imageView2.setImageResource(R.drawable.c230)
        -2->bindingCT.imageView2.setImageResource(R.drawable.lib)
        -1->bindingCT.imageView2.setImageResource(R.drawable.read)
        }
    }


}