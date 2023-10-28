package com.example.quis_8020200128

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LingkaranActivity : AppCompatActivity() {
    lateinit var btnHitung : Button
    lateinit var etJari : EditText
    lateinit var etHasil : TextView
    var isEmptyFields = false
    var jari = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)
        title = "Luas Lingkaran"
        initView()
        initClick()
    }
    private fun initView(){
        btnHitung = findViewById(R.id.btn_hitung)
        etJari = findViewById(R.id.et_jari)
        etHasil = findViewById(R.id.tv_hasil)


    }
    private fun initClick(){
        btnHitung.setOnClickListener {
            jari = etJari.text.toString()
            when{
                jari.isEmpty()->{
                    isEmptyFields = true
                }
            }
            if(!isEmptyFields){
                val hasil = 3.14 * jari.toDouble() * jari.toDouble()
                etHasil.text = hasil.toString()
            }
        }
    }
}