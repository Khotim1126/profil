package com.example.profilkhotim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SekolahActivity : AppCompatActivity() {
    lateinit var sekolahView: RecyclerView
    lateinit var sekolahAdapter: SekolahAdapter
    val list = ArrayList<SekolahData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        sekolahView = findViewById(R.id.rvSekolah)
        sekolahView.layoutManager = LinearLayoutManager( this)

        list.add(SekolahData( "SD Islam Nurul Qur'an", "Jl. Laskar Hisbullah, Kudu, Kota Semarang"))
        list.add(SekolahData( "SMP IT Daarut Tahfidz", "Jl. Genuk Pamongan Km 5, Karangasem, Sayung, Demak"))
        list.add(SekolahData( "SMK Negri 1 Sayung", "Jl. Raya Semarang Demak Km , Sayung, Demak"))

        sekolahAdapter = SekolahAdapter(list)
        sekolahView.adapter = sekolahAdapter
    }
}