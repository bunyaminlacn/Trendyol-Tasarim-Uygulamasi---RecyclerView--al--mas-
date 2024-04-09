package com.example.trendyoltasarim.data

import java.io.Serializable

data class Urunler(var urunResim:Int,
                   var urunBaslik:String,
                   var urunAdet:String,
                   var urunFiyat:String):Serializable {
}