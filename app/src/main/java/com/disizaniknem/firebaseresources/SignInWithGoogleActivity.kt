package com.disizaniknem.firebaseresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_in_with_google.*

class SignInWithGoogleActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_with_google)
        auth = FirebaseAuth.getInstance()

        btnSignIn.setOnClickListener {

        }

    }
}