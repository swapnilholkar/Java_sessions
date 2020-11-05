package com.example.my_activity_demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_demo : AppCompatActivity() {
    var b1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_demo)
    }
    fun goToBrowser(view: View){
        b1 = findViewById<Button>(R.id.myButton)
        b1!!.setOnClickListener(View.OnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com")
            )
            startActivity(i)
        })
    }
}