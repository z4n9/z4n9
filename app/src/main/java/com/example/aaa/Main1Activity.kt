package com.example.aaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aaa.databinding.Activity1MainBinding

class Main1Activity : AppCompatActivity() {
    lateinit var Sulik: Activity1MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1_main)
        Sulik = Activity1MainBinding.inflate(layoutInflater)
    }

    fun onClickMain3(view: View){
        val perehod = Intent(this, Main2Activity::class.java)
        startActivity(perehod)
    }
}