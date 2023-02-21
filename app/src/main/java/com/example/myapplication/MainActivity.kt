package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingM : ActivityMainBinding
//    var room = 0
    override fun onCreate(savedInstanceState: Bundle?) {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        bindingM= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingM.root)

    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
////        if(requestCode==100 && resultCode == RESULT_OK && data != null)
////            room = data.getStringExtra("actroom").toString()
////        else
////            room="-1000"
////        bindingM.textView.text=room.toString()
//    }


    fun search(view : View) {
        val intent = Intent(this, SearchActivity::class.java)
        startActivity(intent)
    }



}
