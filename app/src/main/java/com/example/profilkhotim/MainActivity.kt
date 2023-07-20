package com.example.profilkhotim

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
            Toast.makeText(this, "Ini Tombol Profile", Toast.LENGTH_SHORT).show()
        }

        bntEducation.setOnClickListener {
            Toast.makeText(this, "Ini Tombol Education", Toast.LENGTH_SHORT).show()
        }

        bntSkill.setOnClickListener {
            Toast.makeText(this, "Ini Tombol Skill", Toast.LENGTH_SHORT).show()
        }

        bntportofolio.setOnClickListener {
            Toast.makeText(this, "Ini Tombol Portofolio", Toast.LENGTH_SHORT).show()
        }

        bntHobby.setOnClickListener {
            Toast.makeText(this, "Ini Tombol Hobby", Toast.LENGTH_SHORT).show()
        }
    }
}