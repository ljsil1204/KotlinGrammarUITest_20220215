package com.neppplus.kotlingrammaruitest_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            var inputId = inputIdTxt.text.toString()
            var inputPassword = inputPassword.text.toString()

            if (inputId == "admin" && inputPassword == "asdf") {
                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인에 실패했습니다", Toast.LENGTH_SHORT).show()
            }

        }

    }
}