package com.example.aaa

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import com.example.aaa.databinding.ActivityMain3Binding
import com.example.aaa.databinding.ActivityMain4Binding

class MainActivity4 : ComponentActivity() {

    lateinit var Zayn: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        Zayn = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(Zayn.root)

        if (intent.hasExtra("kilt")) {
            val pers2 = intent.getIntExtra("kilt", 0)
            Zayn.lili.setImageResource(pers2)
        }

        if (intent.hasExtra("kilt2")) {
            val pers1 = intent.getIntExtra("kilt2", 0)
            Zayn.Lil.setImageResource(pers1)
        }




    }

    fun onClickVibor(view: View) {
            val onClickVibor = Intent(this, MainActivity2::class.java)
            startActivity(onClickVibor)
    }
    fun onClickVibor2(view: View){
        val onClickVibor2 = Intent(this, MainActivity3::class.java)
        startActivity(onClickVibor2)
    }

}
