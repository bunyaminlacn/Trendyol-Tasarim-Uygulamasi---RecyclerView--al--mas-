package com.example.trendyoltasarim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.trendyoltasarim.adapter.UrunlerAdapter
import com.example.trendyoltasarim.data.Urunler
import com.example.trendyoltasarim.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentAnaSayfaBinding.inflate(layoutInflater,container,false)

        binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        var urunlerListesi=ArrayList<Urunler>()

        val u1=Urunler(R.drawable.defs,"Samsung Galaxy S23 256 GB Yeşil Cep Telefonu(Samsung...","234","25324")
        val u2=Urunler(R.drawable.defs,"Samsung Galaxy S23 256 GB Yeşil Cep Telefonu(Samsung...","2344","27540")
        val u3=Urunler(R.drawable.defs,"Samsung Galaxy S23 256 GB Yeşil Cep Telefonu(Samsung...","2347","25800")
        val u4=Urunler(R.drawable.defs,"Samsung Galaxy S23 256 GB Yeşil Cep Telefonu(Samsung...","214","25700")
        val u5=Urunler(R.drawable.defs,"Samsung Galaxy S23 256 GB Yeşil Cep Telefonu(Samsung...","134","25900")
        val u6=Urunler(R.drawable.defs,"Samsung Galaxy S23 256 GB Yeşil Cep Telefonu(Samsung...","334","22100")
        val u7=Urunler(R.drawable.defs,"Samsung Galaxy S23 256 GB Yeşil Cep Telefonu(Samsung...","934","26700")

        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)

        val urunlerAdapter=UrunlerAdapter(requireContext(),urunlerListesi)
        binding.rv.adapter=urunlerAdapter


        return binding.root
    }


}