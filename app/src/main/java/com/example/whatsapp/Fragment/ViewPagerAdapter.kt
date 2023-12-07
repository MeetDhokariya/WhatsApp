package com.example.whatsapp.Fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.whatsapp.R
import java.util.Objects


class ViewPagerAdapter(val requireActivity: Context,val  imageurls: ArrayList<String>): PagerAdapter() {
    override fun getCount(): Int {
        return imageurls.size

    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view== `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
       var view = LayoutInflater.from(Context).inflate(R.layout.viewpage_item,container,false)
        var imageViewPage = view.findViewById<ImageView>(R.id.imgViewPage)

    }

}
