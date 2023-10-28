package com.example.quis_8020200128

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiActivity : AppCompatActivity() {
    lateinit var btnHitung : Button
    lateinit var etSisi : EditText
    lateinit var etHasil : TextView
    var isEmptyFields = false
    var sisi = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)
        title = "Persegi Activity"
        initView()
        initClick()
    }
    private fun initView(){
        btnHitung = findViewById(R.id.btn_hitung)
        etSisi = findViewById(R.id.et_sisi)
        etHasil = findViewById(R.id.tv_hasil)


    }
    private fun initClick(){
        btnHitung.setOnClickListener {
            sisi = etSisi.text.toString()
            when{
                sisi.isEmpty()->{
                    isEmptyFields = true
                }
            }
            if(!isEmptyFields){
                val hasil = sisi.toDouble() * sisi.toDouble()
                etHasil.text = hasil.toString()
            }
        }
    }
}