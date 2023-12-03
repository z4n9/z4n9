package com.example.aaa

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
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

    fun onClickArtur2(view: View){
        val perehodActivity3 = Intent(this, MainActivity4::class.java)
        perehodActivity3.putExtra("kilt",(R.drawable.artur_stick))
        startActivity(perehodActivity3)
    }
    fun onClickRasul2(view: View){
        val perehodActivity3 = Intent(this, MainActivity4::class.java)
        perehodActivity3.putExtra("kilt",(R.drawable.rasul_stick))
        startActivity(perehodActivity3)
    }
    fun onClickNail2(view: View){
        val perehodActivity3 = Intent(this, MainActivity4::class.java)
        perehodActivity3.putExtra("kilt",(R.drawable.artur_stick))
        startActivity(perehodActivity3)
    }
    fun onClickZayn2(view: View){
        val perehodActivity3 = Intent(this, MainActivity4::class.java)
        perehodActivity3.putExtra("kilt",(R.drawable.zayn_stick))
        startActivity(perehodActivity3)
    }





}