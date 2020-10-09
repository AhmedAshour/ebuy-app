package me.ahmedashour.ebuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*
import me.ahmedashour.ebuy.R.layout.activity_sign_in

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_sign_in)

        signUpTxt.setOnClickListener {

            startActivity(Intent(this, SignUp::class.java))
        }


        //TODO password and email authentification before user can sign in...
        signIn_btn.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}