package com.example.profilkhotim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectActivity : AppCompatActivity() {

    lateinit var projectView: RecyclerView
    lateinit var projectAdapter: ProjectAdapter
    val list = ArrayList<projectData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        projectView = findViewById(R.id.rvProject)
        projectView.layoutManager = LinearLayoutManager( this)

        list.add(
            projectData("Profil Guru", "Aplikasi Profil Guru",
                "https://github.com/Khotim1126/PROFILGURU")
        )

        list.add(
            projectData( "Pendaftaran Siswa", "Aplikasi Pendaftaran Siswa",
            "https://github.com/Khotim1126/Pendaftaran-Siswa")
        )

        projectAdapter = ProjectAdapter(list)
        projectView.adapter = projectAdapter

    }
}