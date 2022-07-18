package com.example.androidstudioodev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidstudioodev6.databinding.CategoryTasarimBinding
import com.example.androidstudioodev6.databinding.FragmentAnasayfaBinding

class FilmlerAdapter(var mContex:Context, var filmlerListesi:List<Filmler>) : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>(){
    inner class CardTasarimTutucu(tasarim:CategoryTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim : CategoryTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContex)
        val tasarim = CategoryTasarimBinding.inflate(layoutInflater, parent, false)
        return  CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewFilmResim.setImageResource(mContex.resources.getIdentifier(film.filmResimAdi,"drawable",mContex.packageName))
        t.cardViewFilm.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}