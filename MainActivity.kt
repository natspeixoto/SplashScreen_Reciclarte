package com.example.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(10000)

        setTheme(R.style.Theme_Main)
        
        setContentView(R.layout.activity_main)

    }
}
