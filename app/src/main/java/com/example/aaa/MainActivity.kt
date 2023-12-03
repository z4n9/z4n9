package com.example.aaa

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.aaa.databinding.ActivityMainBinding

//эта функция дает доступ к кнопкам Activity_Main
class MainActivity : ComponentActivity() {
    lateinit var Asus: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Asus = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Asus.root)


    }

    fun onClickMain2(view: View){
        val onClickMain2 = Intent(this, MainActivity2::class.java)
        startActivity(onClickMain2)
    }


}//жди крч