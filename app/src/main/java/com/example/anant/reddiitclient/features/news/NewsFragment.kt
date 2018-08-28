package com.example.anant.reddiitclient.features.news


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.anant.reddiitclient.R
import com.example.anant.reddiitclient.commons.extensions.inflate
import com.example.anant.reddiitclient.features.news.adapter.NewsAdapter
import kotlinx.android.synthetic.main.fragment_news.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class NewsFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        return container?.inflate(R.layout.fragment_news);

        initAdapter()
    }

    private fun initAdapter(){
        if(news_list.adapter == null){
            news_list.adapter = NewsAdapter()
        }
    }

}
