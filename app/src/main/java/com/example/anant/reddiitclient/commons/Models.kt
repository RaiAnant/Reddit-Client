package com.example.anant.reddiitclient.commons

import com.example.anant.reddiitclient.commons.adapter.AdapterConstants
import com.example.anant.reddiitclient.commons.adapter.ViewType

data class RedditNewsItem(val author : String,   //data class is a special type of class that automatically creates getters ,setters and a constructor
                          val title : String,
                          val numComments : Int,
                          val created : Long,
                          val thumbnail : String,
                          val url : String)  : ViewType{

    override fun getViewType() = AdapterConstants.NEWS
}
