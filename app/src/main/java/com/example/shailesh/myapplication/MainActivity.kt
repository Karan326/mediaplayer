package com.example.shailesh.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mp = MediaPlayer.create(this, R.raw.song)
        val plybtn = findViewById<Button>(R.id.plybtn)
        plybtn.setOnClickListener {

            mp.start()

        }
        val paubtn =findViewById<Button>(R.id.paubtn)
        paubtn.setOnClickListener{
            mp.pause()

        }
    }
}
