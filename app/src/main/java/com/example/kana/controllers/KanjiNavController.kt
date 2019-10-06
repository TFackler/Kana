package com.example.kana.controllers

import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.example.kana.R

class KanjiNavController : Controller() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        // change context to use other theme
        val contextThemeWrapper = ContextThemeWrapper(activity, R.style.KanjiTheme)
        val localInflater = inflater.cloneInContext(contextThemeWrapper)
        return localInflater.inflate(R.layout.controller_practice_nav, container, false)
    }
}