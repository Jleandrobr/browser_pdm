package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var btnIr: Button
    private lateinit var editURL: EditText
    private lateinit var  wvHTML: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnIr = findViewById(R.id.btnIr)
        this.editURL = findViewById(R.id.editURL)
        this.wvHTML = findViewById(R.id.wvHTML)


        this.wvHTML.webViewClient = WebViewClient()
        this.wvHTML.settings.javaScriptEnabled = true
        this.wvHTML.settings.setSupportZoom(true)

        this.btnIr.setOnClickListener {
            this.wvHTML.loadUrl(this.editURL.text.toString())
        }

        if (intent.data != null){
            this.wvHTML.loadUrl(intent.data.toString())
        }

    }
}