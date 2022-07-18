package com.example.androidstudioodev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.androidstudioodev6.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim : FragmentAnasayfaBinding
   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
       tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)


       tasarim.rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
       val filmlerListesi = ArrayList<Filmler>()
       val f1 = Filmler(1,"Bang Bang Baby","bangbangbaby",2020,8.7,"Nuri Bey")
       val f2 = Filmler(2,"Chloe","chloe",2020,8.7,"Nuri Bey")
       val f3 = Filmler(3,"Güzelleştiğim O Yaz","guzellestigimoyaz",2020,8.7,"Nuri Bey")
       val f4 = Filmler(4,"The Terminal List","theterminallist",2020,8.7,"Nuri Bey")
       val f5 = Filmler(5,"The Tomorrow War","thetomorrowwar",2020,8.7,"Nuri Bey")
       val f6 = Filmler(5,"The Purge","thepurge",2020,8.7,"Nuri Bey")
       filmlerListesi.add(f1)
       filmlerListesi.add(f2)
       filmlerListesi.add(f3)
       filmlerListesi.add(f4)
       filmlerListesi.add(f5)
       filmlerListesi.add(f6)
       val adapter = FilmlerAdapter(requireContext(),filmlerListesi)
       tasarim.rv.adapter = adapter


       val filmlerListesi2 = ArrayList<Filmler>()
       filmlerListesi2.add(f6)
       filmlerListesi2.add(f5)
       filmlerListesi2.add(f4)
       filmlerListesi2.add(f3)
       filmlerListesi2.add(f2)
       filmlerListesi2.add(f1)




       tasarim.rv2.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
       val adapter1 = FilmlerAdapter(requireContext(),filmlerListesi2)
       tasarim.rv2.adapter = adapter1



       return tasarim.root
    }
}