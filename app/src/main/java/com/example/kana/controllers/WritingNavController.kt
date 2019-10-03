package com.example.kana.controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bluelinelabs.conductor.Controller
import com.example.kana.R

class WritingNavController : Controller() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_hiragana_katakana_nav, container, false)
        view.findViewById<TextView>(R.id.text_nav_info).text = resources?.getString(R.string.writing_nav_info)
        return view
    }
}