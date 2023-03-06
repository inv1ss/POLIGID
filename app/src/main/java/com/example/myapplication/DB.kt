package com.example.myapplication

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import com.example.myapplication.databinding.ActivityDbBinding
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class DB : AppCompatActivity() {
    private lateinit var bindingDB: ActivityDbBinding
    private var mDB = Firebase.firestore
    private var dbref=mDB.collection("USER")

    private var txt= ArrayList<String>()

    //    var USER_KEY="USER"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDB = ActivityDbBinding.inflate(layoutInflater)
        setContentView(bindingDB.root)
        getData()

        bindingDB.editTextTextPersonName.setOnKeyListener { _, i, keyEvent ->
            if (i == KeyEvent.KEYCODE_ENTER && keyEvent.action == KeyEvent.ACTION_UP) {
                if (bindingDB.editTextTextPersonName.text.toString() != "") {
                    find()
                } else {
                    Toast.makeText(this, "Введіть прізвище викладача", Toast.LENGTH_SHORT).show()
                }

                return@setOnKeyListener true
            } else {

                false
            }
        }
        bindingDB.editTextTextPersonName.doAfterTextChanged {
            if (bindingDB.editTextTextPersonName.text.toString() != "") {
                find()
            }
        }
    }

    fun btnM(view: View){
        finish()
    }

    private fun getData() {
        dbref.orderBy("surname")
        .get()
            .addOnSuccessListener{
                for(documentSnapshot : DocumentSnapshot in it.documents) {
                        val surname = documentSnapshot.getString("surname").toString()
                        val name = documentSnapshot.getString("name").toString()
                        val patronymic = documentSnapshot.getString("patronymic").toString()
                        val i= "$surname $name $patronymic"
                        txt.add(i)
                    }
          //      bindingDB.textView.text=txt[0].name
            }
            .addOnFailureListener {
                Log.w("TAG", "Error getting documents: ")
            }
    }

    fun onCl(view: View){
        if (bindingDB.editTextTextPersonName.text.toString() != "") {
            find()
        } else {
            Toast.makeText(this, "Введіть прізвище викладача", Toast.LENGTH_SHORT).show()
        }
        find()
    }

    private fun find(){
        val sur=bindingDB.editTextTextPersonName.text.toString()
        val len=sur.length
        val fl= ArrayList<String>()
        for(i in 0 until (txt.size)) { if((txt[i].substring(0,len))==sur){ fl.add(txt[i]) } else continue}

        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, fl
        )
        bindingDB.listV.adapter = arrayAdapter
    }
}




