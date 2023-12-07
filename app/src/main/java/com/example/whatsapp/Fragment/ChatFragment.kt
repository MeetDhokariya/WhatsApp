package com.example.whatsapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.whatsapp.R


class ChatFragment : Fragment() {

    lateinit var viewPager : ViewPager

    private val imageurls = arrayListOf(
            "https://img.freepik.com/free-photo/sports-car-races-through-dark-blurred-motion-generative-ai_188544-12490.jpg",
            "https://www.team-bhp.com/sites/default/files/styles/check_extra_large_for_review/public/harrier-tropical-mist-mobile.jpg",
          "https://www.bleepstatic.com/content/hl-images/2023/05/25/Android_malware.jpg"
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       var view =  inflater.inflate(R.layout.fragment_chat, container, false)


        return view
    }


      private fun initBinding(view: View){
          viewPager = view.findViewById<ViewPager>(R.id.viewPager)
          var viewPager_adapter = ViewPagerAdapter(activity,imageurls)
      }
}