package com.kcanmin.my_webviewsact

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kcanmin.my_webviewsact.ui.theme.My_WebviewsActTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView : WebView = findViewById(R.id.webview)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://naver.com")
        webView.settings.javaScriptEnabled = true

        findViewById<Button>(R.id.button2).setOnClickListener{
            webView.loadUrl("https://www.bungie.net/7/en/destiny")
        }

        findViewById<Button>(R.id.button3).setOnClickListener{
            webView.loadUrl("https://overwatch.blizzard.com/ko-kr/")
        }

        findViewById<Button>(R.id.button4).setOnClickListener{
            webView.loadUrl("https://playeternalreturn.com/main?hl=ko-KR")
        }

        findViewById<Button>(R.id.button5).setOnClickListener{
            webView.goBack()
        }

        findViewById<Button>(R.id.button6).setOnClickListener{
            webView.reload()
        }

        findViewById<Button>(R.id.button7).setOnClickListener{
            webView.goForward()
        }

    }
}
