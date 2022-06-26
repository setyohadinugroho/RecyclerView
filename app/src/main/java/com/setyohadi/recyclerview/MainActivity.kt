package com.setyohadi.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.setyohadi.recyclerview.adapter.AdapterTeamBola
import com.setyohadi.recyclerview.databinding.ActivityMainBinding
import com.setyohadi.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain(nama = "Thibaut Courtois",R.drawable.courtois,"Penjaga Gawang","2.00 m","Bree (Belgia)","11 Mei 1992"))
        listPemain.add(Pemain(nama = "Karim Benzema",R.drawable.courtois,"Penyerang","1,85 m","Lyon (Perancis)","19 Desember 1987"))
        listPemain.add(Pemain(nama = "Marcelo Vieira da Silva",R.drawable.courtois,"Belakang","1,74 m","Rio de Janeiro (Brasil)","12 Mei 1988"))
        listPemain.add(Pemain(nama = "Sergio Ramos García",R.drawable.courtois,"Belakang","1,84 m","Camas (Sevilla)","30 Maret 1986"))
        listPemain.add(Pemain(nama = "Zinedine Yazid Zidane",R.drawable.courtois,"Pelatih","1,85 m","Marseille (Prancis)","23 Juni 1972"))

        binding.list.adapter = AdapterTeamBola(this,listPemain,object : AdapterTeamBola.OnClickListener{
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })


    }
}