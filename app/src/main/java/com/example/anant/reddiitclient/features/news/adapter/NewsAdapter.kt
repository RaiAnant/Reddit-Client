package com.example.anant.reddiitclient.features.news.adapter

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.anant.reddiitclient.commons.adapter.AdapterConstants
import com.example.anant.reddiitclient.commons.adapter.ViewType
import com.example.anant.reddiitclient.commons.adapter.ViewTypeDelegateAdapter
import java.util.ArrayList

class NewsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: ArrayList<ViewType>
    private var delegateAdapters = SparseArrayCompat<ViewTypeDelegateAdapter>()  //SparesArray maps integers to objects and is more efficient than hash maps
    private val loadingItem = object  : ViewType {
        override fun getViewType() = AdapterConstants.LOADING //it is short hand for rdefining a function that returns AdapterConstants.LOADING
    }

    init{     //inti is like a constructor for a class , used to intilize member variables and objects
        delegateAdapters.put(AdapterConstants.LOADING, LoadingDelegateAdapter())
        items = ArrayList()
        items.add(loadingItem)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegateAdapters.get(viewType).onCreateViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder,this.items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return this.items.get(position).getViewType()
    }
}