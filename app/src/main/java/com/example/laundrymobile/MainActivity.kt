package com.example.laundrymobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main)

        val btnListHarga: Button = findViewById(R.id.btnList)
        btnListHarga.setOnClickListener(this)
        val btnPesan: Button = findViewById(R.id.btnPesan)
        btnPesan.setOnClickListener(this)
        val btnResi: Button = findViewById(R.id.btnResi)
        btnResi.setOnClickListener(this)
        val btnKeluar: Button = findViewById(R.id.btnKeluar)
        btnKeluar.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id){
            R.id.btnList -> {
                val listH_intent = Intent(this@MainActivity, Kategori::class.java)
                startActivity(listH_intent)
            }
            R.id.btnPesan -> {
                val pesan_intent = Intent(this@MainActivity, PesanActivity::class.java)
                startActivity(pesan_intent)
            }
            R.id.btnResi -> {
                val Resi_intent = Intent(this@MainActivity, ListActivity::class.java)
                startActivity(Resi_intent)
            }
            R.id.btnKeluar -> {
                finish()
                System.exit(0);
            }
        }
    }

}

