package online.naamjapa.app;

import android.webkit.WebView;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onBackPressed() {
        WebView webView = this.bridge.getWebView();
        if (webView != null && webView.canGoBack()) {
            // Navigate back within the site (e.g. mantra page -> home)
            webView.goBack();
        } else {
            // Already at the home page — exit the app like a normal Android app
            super.onBackPressed();
        }
    }
}