package com.example.aaa

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
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
    fun onClickMain3(view: View){
        val perehodActivity3 = Intent(this, MainActivity3::class.java)
        startActivity(perehodActivity3)
    }

}