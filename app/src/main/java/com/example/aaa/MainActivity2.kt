package com.example.aaa

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.aaa.databinding.ActivityMain2Binding

//эта функция дает доступ к кнопкам Activity_Main

class MainActivity2 : ComponentActivity() {
    lateinit var Sukik: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Sukik = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(Sukik.root)


    }
    //кнопка перехода в 3 лист


    fun onClickMain3(view: View) {
        var Artur = (R.id.Artur)
        var Rasul = (R.id.Rasul)
        var Nail = (R.id.Nail)
        var Zayn = (R.id.Zayn)
        var Error = (R.id.Eror)
        fun foo() {
            listOf(Artur,Rasul,Nail,Zayn,Error).forEach{
                if (it == )
            }
        }



            val perehodActivity3 = Intent(this, MainActivity3::class.java)
            startActivity(perehodActivity3)

        }




}