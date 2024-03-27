package com.bignerdranch.android.photogallery

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

    override fun onBackPressed() {
        try {
            var webView: WebView = findViewById(R.id.web_view)
            if(webView.canGoBack()){
                webView.goBack()
            }
            else{
                super.onBackPressed()
            }
        }
        catch (e : Exception) {
            super.onBackPressed()
        }
    }

}
