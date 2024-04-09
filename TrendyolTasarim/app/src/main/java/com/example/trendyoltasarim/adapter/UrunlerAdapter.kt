package com.example.trendyoltasarim.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.trendyoltasarim.data.Urunler
import com.example.trendyoltasarim.databinding.CardTasarimBinding
import com.example.trendyoltasarim.databinding.FragmentAnaSayfaBinding

class UrunlerAdapter(var mContext:Context,var urunlerListesi:List<Urunler>)
    :RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
      val binding= CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
      return CardTasarimTutucu((binding))
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        var urun=urunlerListesi.get(position)
        val t=holder.tasarim

        t.imageViewResimUrun.setImageResource(urun.urunResim)
        t.textViewBaslik.setText(urun.urunBaslik)
        t.textViewAdet.setText(urun.urunAdet)
        t.textViewFiyat.setText(urun.urunFiyat)

    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }

}