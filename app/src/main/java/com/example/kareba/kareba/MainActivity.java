package com.example.kareba.kareba;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends Activity {
    private WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView view = (WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.loadUrl("http://kareba.dutadamai.id");

        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setSupportZoom(true);
        view.reload();
    }

    public class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }

    //Mengaktifkan tombol back
    @Override
    public void onBackPressed() {
        WebView view = (WebView) findViewById(R.id.webView);
        if(view!=null)
        {
            if(view.canGoBack())
            {
                view.goBack();
            }
            else
            {
                super.onBackPressed();
            }
        }
    }

}
