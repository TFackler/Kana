package com.example.kana.controllers

import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.example.kana.R

class KatakanaNavController : Controller() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        // change context to use other theme
        val contextThemeWrapper = ContextThemeWrapper(activity, R.style.KatakanaTheme)
        val localInflater = inflater.cloneInContext(contextThemeWrapper)
        val view : View = localInflater.inflate(R.layout.controller_practice_nav, container, false)
        view.setBackgroundColor(container.context.getColor(R.color.katakana_color_background))
        return view
        // view.findViewById<TextView>(R.id.text_nav_info).text = container.context.getString(R.string.reading_nav_info)
    }
}