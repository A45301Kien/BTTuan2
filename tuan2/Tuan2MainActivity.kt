package com.example.myapplication.tuan2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class Tuan2MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan2_main)
        var txt1=findViewById<EditText>(R.id.tuan2Txt1)
        var txt2=findViewById<EditText>(R.id.tuan2Txt2)
        var btn1=findViewById<Button>(R.id.tuan2Btn1)
        btn1!!.setOnClickListener { var i=Intent(this@Tuan2MainActivity,Tuan21MainActivityResult::class.java)
            i.putExtra("so1",txt1!!.text.toString())
            i.putExtra("so2",txt2!!.text.toString())
            startActivity(i)
     }
    }
}