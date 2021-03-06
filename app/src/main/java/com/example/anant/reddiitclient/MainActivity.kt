package com.example.anant.reddiitclient

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.example.anant.reddiitclient.features.news.NewsFragment

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        if(savedInstanceState == null){
            changeFragment(NewsFragment())
        }
    }

    fun changeFragment(f: Fragment, cleanStack: Boolean =false){
        val ft = supportFragmentManager.beginTransaction()
        if(cleanStack){
            clearBackStack()
        }
        ft.setCustomAnimations(R.anim.abc_fade_in,R.anim.abc_fade_out,R.anim.abc_popup_enter,R.anim.abc_popup_exit)
        ft.replace(R.id.activity_base_content,f)
        ft.addToBackStack(null)
        ft.commit()
    }

    private fun clearBackStack() {
        val manager = supportFragmentManager
        if(manager.backStackEntryCount > 0){
            val first = manager.getBackStackEntryAt(0)
            manager.popBackStack(first.id,FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val fragmentManager = supportFragmentManager 
        if(fragmentManager.backStackEntryCount > 1){
            fragmentManager.popBackStack()
        }else{
            finish()
        }

    }
}
