package com.example.anant.reddiitclient.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.anant.reddiitclient.R
import com.example.anant.reddiitclient.commons.RedditNewsItem
import com.example.anant.reddiitclient.commons.adapter.ViewType
import com.example.anant.reddiitclient.commons.adapter.ViewTypeDelegateAdapter
import com.example.anant.reddiitclient.commons.extensions.inflate
import com.example.anant.reddiitclient.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item)){
        fun bind(item: RedditNewsItem) = with(itemView){
            img_thumbnail.loadImg(item.thumbnail)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }

}