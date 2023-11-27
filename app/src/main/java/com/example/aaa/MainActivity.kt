package com.example.aaa

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aaa.databinding.ActivityMainBinding
import com.example.aaa.ui.theme.AaaTheme

class MainActivity : ComponentActivity() {
    lateinit var Asus: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Asus = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Asus.root)



    }
}




