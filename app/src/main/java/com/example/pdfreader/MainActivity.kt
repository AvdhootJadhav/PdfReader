package com.example.pdfreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pdfreader.ViewPdfActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var showBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showBtn = findViewById(R.id.showBtn)
        showBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, ViewPdfActivity::class.java)
            startActivity(intent)
        }
    }
}