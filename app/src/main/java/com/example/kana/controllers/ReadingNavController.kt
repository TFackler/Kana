package com.example.kana.controllers

import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bluelinelabs.conductor.Controller
import com.example.kana.R



class ReadingNavController : Controller() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        // change context to use other theme
        val contextThemeWrapper = ContextThemeWrapper(activity, R.style.KatakanaTheme)
        val localInflater = inflater.cloneInContext(contextThemeWrapper)
        val view: View = localInflater.inflate(R.layout.controller_hiragana_katakana_nav, container, false)

        view.findViewById<TextView>(R.id.text_nav_info).text = container.context.getString(R.string.reading_nav_info)
        return view
    }
}