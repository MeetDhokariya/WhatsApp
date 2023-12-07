package com.example.whatsapp

import android.os.Bundle
import android.view.Gravity
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.whatsapp.Fragment.CallsFragment
import com.example.whatsapp.Fragment.ChatFragment
import com.example.whatsapp.Fragment.UpdateFragment
import com.example.whatsapp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        var imgcamera = findViewById<ImageView>(R.id.imgcamera)
        var imgsearch = findViewById<ImageView>(R.id.imgsearch)
        var imgmenu = findViewById<ImageView>(R.id.imgmenu)
        var btnDrawer = findViewById<ImageView>(R.id.btnDrawer)
        var txtChats = findViewById<TextView>(R.id.txtChats)
        var txtUpdate = findViewById<TextView>(R.id.txtUpdate)
        var txtCalls = findViewById<TextView>(R.id.txtCalls)
        var navigationDrawer = findViewById<NavigationView>(R.id.navigationDrawer)
        var txtHome = findViewById<TextView>(R.id.txtHome)
        var txtSettings = findViewById<TextView>(R.id.txtSettings)
        var txtCall = findViewById<TextView>(R.id.txtCall)
        var txtGroup = findViewById<TextView>(R.id.txtGroup)

        imgcamera.setOnClickListener {
            Toast.makeText(this,"Camera Button",Toast.LENGTH_SHORT).show()
        }
        imgsearch.setOnClickListener {
            Toast.makeText(this,"Search Button",Toast.LENGTH_SHORT).show()
        }
        imgmenu.setOnClickListener {
            Toast.makeText(this,"Menu Button",Toast.LENGTH_SHORT).show()
        }

        btnDrawer.setOnClickListener {
            drawerLayout.openDrawer(Gravity.START)
        }
        txtHome.setOnClickListener {
            drawerLayout.closeDrawer(Gravity.START)
        }
        txtSettings.setOnClickListener {
            Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show()
        }
        txtCall.setOnClickListener {
            Toast.makeText(this,"Call",Toast.LENGTH_SHORT).show()
        }
        txtGroup.setOnClickListener {
            Toast.makeText(this,"Group",Toast.LENGTH_SHORT).show()
        }

        var chatFragment = ChatFragment()
        replaceFragment(chatFragment)

        txtChats.setOnClickListener {

            var chatFragment = ChatFragment()
            replaceFragment(chatFragment)
        }
        txtUpdate.setOnClickListener {
            var updateFragment = UpdateFragment()
            replaceFragment(updateFragment)
        }
        txtCalls.setOnClickListener {
            var callsFragment = CallsFragment()
            replaceFragment(callsFragment)
        }



    }
    private  fun replaceFragment(fragment: Fragment){
        var fragmentTrasistion = supportFragmentManager.beginTransaction()
        fragmentTrasistion.replace(R.id.fragmentfram,fragment)
        fragmentTrasistion.addToBackStack(null)
        fragmentTrasistion.commit()
    }
}