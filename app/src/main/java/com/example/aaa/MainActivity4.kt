package com.example.aaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.aaa.databinding.ActivityMain3Binding
import com.example.aaa.databinding.ActivityMain4Binding

class MainActivity4 : ComponentActivity() {
    lateinit var Zayn: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        Zayn = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(Zayn.root)





    }
    fun onClickMain5(view: View){
        val perehodActivity5 = Intent(this, MainActivity::class.java)
        startActivity(perehodActivity5)
    }
}