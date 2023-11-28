package com.example.aaa

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.aaa.databinding.ActivityMain3Binding

//эта функция дает доступ к кнопкам Activity_Main
class MainActivity3 : ComponentActivity() {
    lateinit var Nail: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Nail = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(Nail.root)

    }
    //кнопка верунтся назад
    fun onClickMain3(view: View){
        val perehodActivity3 = Intent(this, MainActivity::class.java)
        startActivity(perehodActivity3)
    }

}