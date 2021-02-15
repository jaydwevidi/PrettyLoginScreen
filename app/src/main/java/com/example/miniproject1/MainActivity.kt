package com.example.miniproject1

import android.content.Intent
import android.location.Location
import android.location.LocationListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import kotlinx.coroutines.*
import java.lang.Exception
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this , LoginActivity::class.java))
            finish()
        }, 3000)

        Log.i("TAG", "this will be called immediately")


    }
}