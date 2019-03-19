package com.example.ozellistirilmislistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView wb = findViewById(R.id.web); //Webview componentinin tanımlanması
        WebSettings ws = wb.getSettings(); //webviewın settingslerini ayarlamak için gerekli olan WebSettings objesi tanımlanır
        ws.setBuiltInZoomControls(true); //zoom yapabilme işlemine izin verilir
        ws.setJavaScriptEnabled(true); //javascript erişimine izin verir.
        String url = getIntent().getStringExtra("<StringName>");//intentten gelen urlyi url Stringine atar
        wb.loadUrl(url); //webviewına urlyi yükler.


    }
}
