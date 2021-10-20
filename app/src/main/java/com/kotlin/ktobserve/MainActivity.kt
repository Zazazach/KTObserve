package com.kotlin.ktobserve

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity :AppCompatActivity() ,ObserverListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun update(string: String) {

    }
}