package com.example.profilkhotim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bntProfile: CardView = findViewById(R.id.profile)
        val bntEducation: CardView = findViewById(R.id.edication)
        val bntSkill: CardView = findViewById(R.id.skill)
        val bntportofolio: CardView = findViewById(R.id.portofolio)
        val bntHobby: CardView = findViewById(R.id.hobby)

        bntProfile.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        bntEducation.setOnClickListener {
            val intent = Intent(this, SekolahActivity::class.java)
            startActivity(intent)
        }

        bntSkill.setOnClickListener {
            val intent = Intent(this, SkillActivity::class.java)
            startActivity(intent)
        }

        bntportofolio.setOnClickListener {
            val intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }

        bntHobby.setOnClickListener {
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
        }
    }
}