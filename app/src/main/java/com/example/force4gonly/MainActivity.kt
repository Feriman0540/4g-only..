package com.example.force4gonly

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val radioInfoUri = Uri.parse("com.android.settings.radioinfo")
            val radioInfoIntent = Intent(Intent.ACTION_VIEW, radioInfoUri)
            startActivity(radioInfoIntent)
        }

        button2.setOnClickListener {
            val statusInfoIntent = Intent(Settings.ACTION_SETTINGS)
            startActivity(statusInfoIntent)
        }

        button3.setOnClickListener {
            val speedTestUri = Uri.parse("https://www.example.com/speedtest")
            val speedTestIntent = Intent(Intent.ACTION_VIEW, speedTestUri)
            startActivity(speedTestIntent)
        }
    }
}
