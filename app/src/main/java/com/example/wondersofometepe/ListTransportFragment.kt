package com.example.wondersofometepe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wondersofometepe.adapter.TransportAdapter
import com.example.wondersofometepe.data.TransportProvider

class ListTransportFragment (val category: Int): Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list_transport, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.fragmnetListTransport_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(view.context)

        when(category){
            1 -> recyclerView.adapter = TransportAdapter(TransportProvider.buses, 2)
            2 -> recyclerView.adapter = TransportAdapter(TransportProvider.taxis, 1)
            3 -> recyclerView.adapter = TransportAdapter(TransportProvider.ferrys, 2)
            4 -> recyclerView.adapter = TransportAdapter(TransportProvider.taxis,1)
        }

        return view
    }
}