package com.example.aaa

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
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






    fun OnClickLeft(view: View) {
        val Pers1: ImageView = findViewById(R.id.Lil)
        val Left = Pers1.layoutParams as ViewGroup.MarginLayoutParams
        Left.leftMargin -= 20
        Pers1.layoutParams = Left

    }
    fun OnClickRight(view: View) {
        val Pers1: ImageView = findViewById(R.id.Lil)
        val Right = Pers1.layoutParams as ViewGroup.MarginLayoutParams
        Right.leftMargin += 20
        Pers1.layoutParams = Right

    }











    fun onClickLeft2(view: View) {
        val Pers2: ImageView = findViewById(R.id.lili)
        val Left = Pers2.layoutParams as ViewGroup.MarginLayoutParams
        Left.leftMargin -= 20
        Pers2.layoutParams = Left

    }
    fun onClickRight2(view: View) {
        val Pers2: ImageView = findViewById(R.id.lili)
        val Right = Pers2.layoutParams as ViewGroup.MarginLayoutParams
        Right.leftMargin += 20
        Pers2.layoutParams = Right

    }

}
