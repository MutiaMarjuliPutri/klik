package com.mutia.latihan5


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent


class MainActivity : AppCompatActivity() {



    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnkonversisuhu = findViewById<Button>(R.id.btnkonversisuhu)
        val btndiskon = findViewById<Button>(R.id.btndiskon)
        val btnluasvolume = findViewById<Button>(R.id.btnluasvolume)
        val btnganjilgenap = findViewById<Button>(R.id.btnganjilgenap)
        val btnpassingdata= findViewById<Button>(R.id.btnpassingdata)
        val btnlistView= findViewById<Button>(R.id.btnlistView)






        btnkonversisuhu.setOnClickListener {
            startActivity(Intent(this, konversiSuhu::class.java))
        }

        btndiskon.setOnClickListener {
            startActivity(Intent(this, diskon::class.java))
        }

        btnluasvolume.setOnClickListener {
            startActivity(Intent(this, luasvolume::class.java))
        }

        btnganjilgenap.setOnClickListener {
            startActivity(Intent(this, ganjilGenap::class.java))
        }

        btnpassingdata.setOnClickListener {
            startActivity(Intent(this, passingdata2::class.java))
        }
        btnlistView.setOnClickListener {
            startActivity(Intent(this, listView2::class.java))
        }

    }
}