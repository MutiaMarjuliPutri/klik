package com.mutia.latihan5


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mutia.latihan5.Adapter.bukuadapter
import com.mutia.latihan5.model.ModelBuku



class RecyclerView : AppCompatActivity() {

    //view group --> bisa menampung data lebih banyak lebih cepat
    //recycle load data yg d layar aja
    private lateinit var  rv_buku : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)



        rv_buku = findViewById(R.id.rv_buku)
        //ini kita bikin array data
        val listBuku = listOf(
            ModelBuku(title = "Buku Android Kotlin 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Android Kotlin2 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Android Kotlin3 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Android Kotlin4 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Android Kotlin5 2024", penulis = "Rizki Syaputra"),
        )
        val nBukuAdapter = bukuadapter(listBuku)
        rv_buku.apply {
            layoutManager = LinearLayoutManager(this@RecyclerView) // Ganti NamaActivity dengan nama Activity Anda
            var Adapter = nBukuAdapter
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
}