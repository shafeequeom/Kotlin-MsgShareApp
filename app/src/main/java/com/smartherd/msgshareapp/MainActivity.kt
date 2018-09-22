package com.smartherd.msgshareapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.smartherd.msgshareapp.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity","Button Was Clicked")
            Toast.makeText(this,"Button Was Clicked",Toast.LENGTH_SHORT).show()
        }

        nextActivity.setOnClickListener{
            val message = etUserMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }
}
