package com.example.androidstudioodev6

import java.io.Serializable


class Filmler( var filmId:Int,
               var filmAdi:String,
               var filmResimAdi:String,
               var filmYili:Int,
               var filmFiyat:Double,
               var filmYonetmen:String) : Serializable {
}
