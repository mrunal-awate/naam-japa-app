package online.naamjapa.app;

import android.util.Log;
import android.webkit.WebView;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onBackPressed() {
        WebView webView = this.bridge.getWebView();
        boolean canGoBack = (webView != null) && webView.canGoBack();
        Log.d("BackButtonDebug", "onBackPressed called. webView null? " + (webView == null) + " canGoBack: " + canGoBack);

        if (canGoBack) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}