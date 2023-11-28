package com.example.aaa

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.aaa.databinding.ActivityMainBinding

//эта функция дает доступ к кнопкам Activity_Main

class MainActivity2 : ComponentActivity() {
    lateinit var Sukik: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Sukik = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Sukik.root)

    }
    //кнопка перехода в 3 лист
    fun onClickMain3(view: View){
        val perehod = Intent(this, MainActivity3::class.java)
        startActivity(perehod)
    }

}