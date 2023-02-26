package com.example.myapplication
// фікс обертання екрану, реалізація гуляння між поверхами
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatDelegate
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingM : ActivityMainBinding
    private var editLauncher : ActivityResultLauncher<Intent>? = null
    private var roomMain = 0
    override fun onCreate(savedInstanceState: Bundle?) {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        bindingM= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingM.root)
        editLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.resultCode == RESULT_OK ){
                roomMain = it.data!!.getIntExtra("room", 0)
                changeCorp(roomMain)
            }
        }
    }

    private fun changeCorp(room : Int) {
        when (room) {
            1, 2, 3, 5, 6, 7,
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 122, 123,
            201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216,
            301, 302, 303, 304, 305, 306, 307, 308, 309, 310,
            401, 402, 403, 404 -> {
                bindingM.imageButton2.setImageResource(R.drawable.corpus1zelen)
                bindingM.imageButton.setImageResource(R.drawable.corpus_2)
            }
            -1, -2, -3, -4, -8, 127, 128, 129, 217, 218, 220, 221, 222, 223, 225, 228, 229, 230 -> {
                bindingM.imageButton.setImageResource(R.drawable.corpuss2zelen)
                bindingM.imageButton2.setImageResource(R.drawable.corpus_1)
            }
                else -> {
                bindingM.textView.text = ""
                bindingM.imageButton.setImageResource(R.drawable.corpus_2)
                bindingM.imageButton2.setImageResource(R.drawable.corpus_1)
            }
        }
    }
    fun search(view : View) {
        editLauncher?.launch(Intent(this@MainActivity, SearchActivity::class.java))
    }

    fun corp1(view : View){
        val intent = Intent(this, CorpusOne::class.java)
        intent.putExtra("room", roomMain)
        startActivity(intent)
        bindingM.imageButton.setImageResource(R.drawable.corpus_2)
        bindingM.imageButton2.setImageResource(R.drawable.corpus_1)
    }
    fun corp2(view : View){
        val intent = Intent(this, CorpusTwo::class.java)
        intent.putExtra("room", roomMain)
        startActivity(intent)
        bindingM.imageButton.setImageResource(R.drawable.corpus_2)
        bindingM.imageButton2.setImageResource(R.drawable.corpus_1)
    }
}
