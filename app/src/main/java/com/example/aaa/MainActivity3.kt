package com.example.aaa

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.aaa.databinding.ActivityMainBinding

//эта функция дает доступ к кнопкам Activity_Main
class MainActivity3 : ComponentActivity() {
    lateinit var Nail: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Nail = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Nail.root)

    }
    //кнопка верунтся назад
    fun onClickMain3(view: View){
        val perehod = Intent(this, MainActivity::class.java)
        startActivity(perehod)
    }

}