package com.example.aaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aaa.databinding.FightMainBinding

class Main2Activity : AppCompatActivity() {
    lateinit var Nail: FightMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fight_main)
        Nail = FightMainBinding.inflate(layoutInflater)
    }
}