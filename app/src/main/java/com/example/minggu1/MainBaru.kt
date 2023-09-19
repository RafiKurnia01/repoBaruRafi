package com.example.minggu1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainBaru : AppCompatActivity(), View.OnClickListener {
    private lateinit var inputPanjang: EditText
    private lateinit var inputLebar: EditText
    private lateinit var inputTinggi: EditText
    private lateinit var hasil : TextView
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutprojekgit)
        inputPanjang = findViewById(R.id.inputPanjang)
        inputLebar = findViewById(R.id.inputLebar)
        inputTinggi = findViewById(R.id.inputTinggi)
        hasil = findViewById(R.id.hasil)
        btn = findViewById(R.id.tombol)

        btn.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.tombol){
            var panjang = inputPanjang.text.toString().trim()
            var lebar = inputLebar.text.toString().trim()
            var tinggi = inputTinggi.text.toString().trim()

            var isempty = false
            if(panjang.isEmpty()){
                isempty = true
                inputPanjang.error = "Harus diisi"
            }
            if(lebar.isEmpty()){
                isempty = true
                inputLebar.error = "Harus diisi"
            }
            if(tinggi.isEmpty()){
                isempty = true
                inputTinggi.error = "Harus diisi"
            }
            if(!isempty){
                val volume = panjang.toDouble() * lebar.toDouble() * tinggi.toDouble()
                //hasil.text = volume.toString()
                hasil.text = isempty.toString()
            }else{
                hasil.text = isempty.toString()
            }
        }
    }

}