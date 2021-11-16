package com.example.perfectoperritos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.core.net.toUri
import coil.load
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     val viewModel:MainViewModel by viewModels()

    viewModel.apiResponse.observe(this,
    { findViewById<ImageView>(R.id.imageButton).load(
        it?.message?.toUri()?.buildUpon()?.scheme("https")?.build()
    ) })
    findViewById<Button>(R.id.button).setOnClickListener { viewModel.getRandomDog() } }}

