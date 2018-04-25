package com.example.administrator.multiwaveheaderdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        multiWaveHeader.scaleY = -1f
        multiWaveHeader.velocity = 6.1F
        multiWaveHeader.progress = 0.58F
        multiWaveHeader.startColor = 0xfff29d4b.toInt()
        multiWaveHeader.closeColor = 0xff8b281f.toInt()
    }
}
