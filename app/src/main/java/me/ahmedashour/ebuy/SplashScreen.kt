package me.ahmedashour.ebuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.postDelayed

class SplashScreen : AppCompatActivity() {

    //Duration of splash screen
    private val SPLASH_TIME:Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(
            {
            startActivity(Intent(this, SignIn::class.java))
            finish()
            }, SPLASH_TIME
        )

    }
}


