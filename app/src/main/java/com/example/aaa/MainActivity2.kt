package com.example.aaa

import android.app.Activity
import android.content.Intent
import android.media.Image.Plane
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.runtime.internal.isLiveLiteralsEnabled
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
    fun onClickArtur (view: View) {
        val gamer1 = Intent(this, MainActivity4::class.java)
        gamer1.putExtra("kilt2",(R.drawable.artur_stick))
        startActivity(gamer1)
    }

    fun onClickRasul (view: View) {
        val gamer1 = Intent(this, MainActivity4::class.java)
        gamer1.putExtra("kilt2",(R.drawable.rasul_stick))
        startActivity(gamer1)
    }
    fun onClickNail (view: View) {
        val gamer1 = Intent(this, MainActivity4::class.java)
        gamer1.putExtra("kilt2",(R.drawable.artur_stick))
        startActivity(gamer1)
    }
    fun onClickZayn (view: View) {
        val gamer1 = Intent(this, MainActivity4::class.java)
        gamer1.putExtra("kilt2",(R.drawable.zayn_stick))
        startActivity(gamer1)
    }

}
