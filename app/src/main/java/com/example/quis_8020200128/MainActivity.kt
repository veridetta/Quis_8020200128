package com.example.quis_8020200128

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnSegitiga: Button
    lateinit var btnLingkaran: Button
    lateinit var btnPersegi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Main Activity"
        initView()
        initClick()
    }
    private fun initView(){
        btnSegitiga = findViewById(R.id.btn_segitiga)
        btnLingkaran = findViewById(R.id.btn_lingkaran)
        btnPersegi = findViewById(R.id.btn_persegi)
    }
    private fun initClick(){
        btnSegitiga.setOnClickListener {
            startActivity(Intent(this, SegitigaActivity::class.java))
        }
        btnLingkaran.setOnClickListener {
            startActivity(Intent(this, LingkaranActivity::class.java))
        }
        btnPersegi.setOnClickListener {
            startActivity(Intent(this, PersegiActivity::class.java))
        }
    }
}