package online.naamjapa.app;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.activity.OnBackPressedCallback;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                WebView webView = bridge.getWebView();
                boolean canGoBack = (webView != null) && webView.canGoBack();
                Log.d("BackButtonDebug", "Back pressed. canGoBack: " + canGoBack);

                if (canGoBack) {
                    webView.goBack();
                } else {
                    // Nothing left to go back to — temporarily disable this callback
                    // and re-trigger back press so the system handles it (closes the app).
                    setEnabled(false);
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
        });
    }
}