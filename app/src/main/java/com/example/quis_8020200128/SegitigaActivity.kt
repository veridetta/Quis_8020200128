package com.example.quis_8020200128

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SegitigaActivity : AppCompatActivity() {
    lateinit var btnHitung : Button
    lateinit var etAlas : EditText
    lateinit var etTinggi : EditText
    lateinit var etHasil : TextView
    var isEmptyFields = false
    var alas = ""
    var tinggi = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)
        title = "Segitiga Activity"
        initView()
        initClick()
    }
    private fun initView(){
        btnHitung = findViewById(R.id.btn_hitung)
        etAlas = findViewById(R.id.et_alas)
        etTinggi = findViewById(R.id.et_tinggi)
        etHasil = findViewById(R.id.tv_hasil)

    }
    private fun initClick(){
        btnHitung.setOnClickListener {
            alas = etAlas.text.toString()
            tinggi = etTinggi.text.toString()
            when{
                alas.isEmpty()->{
                    isEmptyFields = true
                    etAlas.error = "Alas ini tidak boleh kosong"
                }
                tinggi.isEmpty()->{
                    isEmptyFields = true
                    etTinggi.error = "Tinggi ini tidak boleh kosong"
                }
            }
            if(!isEmptyFields){
                val hasil = 0.5 * alas.toDouble() * tinggi.toDouble()
                etHasil.text = hasil.toString()
            }
        }
    }
}