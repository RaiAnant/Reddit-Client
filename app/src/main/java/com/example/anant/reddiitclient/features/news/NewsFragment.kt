package com.example.anant.reddiitclient.features.news


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.anant.reddiitclient.R
import com.example.anant.reddiitclient.commons.inflate

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class NewsFragment : Fragment() {

    private var newsList: RecyclerView? = null;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = container?.inflate(R.layout.fragment_news)
        newsList = view?.findViewById(R.id.news_list)
        newsList?.setHasFixedSize(true)
        newsList?.layoutManager = LinearLayoutManager(context)
        return view
    }


}
