package com.johnfromwit.yoreexplore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.johnfromwit.yoreexplore.R
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        btn_closeSplash.setOnClickListener(){
            finish()
        }
    }
}
