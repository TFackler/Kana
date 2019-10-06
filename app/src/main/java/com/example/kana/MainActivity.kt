package com.example.kana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.HorizontalChangeHandler
import com.example.kana.controllers.HiraganaNavController
import com.example.kana.controllers.KanjiNavController
import com.example.kana.controllers.KatakanaNavController
import com.example.kana.controllers.MainNavController

class MainActivity : AppCompatActivity() {


    lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val container: ViewGroup = findViewById(R.id.controller_container)

        router = Conductor.attachRouter(this, container, savedInstanceState)
        if(!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(MainNavController()))
        }
    }

    override fun onBackPressed() {
        if (!router.handleBack()) {
            super.onBackPressed()
        }
    }


    // navigation
    fun navKanji(view : View) {
        router.pushController(
            RouterTransaction.with(KanjiNavController())
            .pushChangeHandler(HorizontalChangeHandler())
            .popChangeHandler(HorizontalChangeHandler()))
    }

    fun navHiragana(view : View) {
        router.pushController(RouterTransaction.with(HiraganaNavController())
            .pushChangeHandler(HorizontalChangeHandler())
            .popChangeHandler(HorizontalChangeHandler()))
    }

    fun navKatakana(view : View) {
        router.pushController(
            RouterTransaction.with(KatakanaNavController())
                .pushChangeHandler(HorizontalChangeHandler())
                .popChangeHandler(HorizontalChangeHandler()))
    }

    fun actionNotImplemented(view : View) {
        Toast.makeText(this, "Action not yet implemented", Toast.LENGTH_SHORT).show()
    }
}
