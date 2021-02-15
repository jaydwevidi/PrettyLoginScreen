package com.example.miniproject1

import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        loginButton.setOnClickListener {
            loginButton.startAnimation {
                loginComplete()
            }
        }


    }

    fun loginComplete(){
        Handler(Looper.getMainLooper()).postDelayed({
            //startActivity(Intent(this , MainActivity2::class.java))
            finish()
        }, 5000)
    }
}