package storm_lib.base.BaseCordovaFragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.efeiyi.bigwiki.R;

import org.apache.cordova.ConfigXmlParser;
import org.apache.cordova.CordovaInterfaceImpl;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewImpl;
import org.apache.cordova.PluginEntry;
import org.apache.cordova.engine.SystemWebView;

import java.util.ArrayList;

import butterknife.Unbinder;
import storm_lib.base.BaseCordovaActivity;

public abstract  class BaseCordovaFragment extends Fragment {

    protected CordovaWebView webView;

    protected CordovaPreferences preferences;
    protected String launchUrl;
    protected ArrayList<PluginEntry> pluginEntries;
    protected CordovaInterfaceImpl cordovaInterface;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // rootView will contain cordova web view
        View rootView = inflater.inflate(attachLayoutRes(), container, false);
        cordovaInterface = new CordovaInterfaceImpl(getActivity());
//        if (savedInstanceState != null)
//            cordovaInterface.restoreInstanceState(savedInstanceState);

        loadConfig();
        // new web view
        webView = new CordovaWebViewImpl(CordovaWebViewImpl.createEngine(getActivity(), preferences));

        RelativeLayout.LayoutParams wvlp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        webView.getView().setLayoutParams(wvlp);
        // init
        if (!webView.isInitialized()) {
            webView.init(cordovaInterface, pluginEntries, preferences);
            ((SystemWebView)(webView.getView())).getSettings().setUserAgentString("Android");
        }
        cordovaInterface.onCordovaInit(webView.getPluginManager());
        // your Url
        webView.loadUrl(loadWebViewUrl());
        ((FrameLayout) rootView).addView(webView.getView());
        return rootView;
    }

    protected abstract String loadWebViewUrl();


    protected abstract int attachLayoutRes();


    protected void loadConfig() {
        ConfigXmlParser parser = new ConfigXmlParser();
        parser.parse(getActivity());
        preferences = parser.getPreferences();
        preferences.setPreferencesBundle(getActivity().getIntent().getExtras());
        // set config.xml
        launchUrl = parser.getLaunchUrl();
        pluginEntries = parser.getPluginEntries();
    }
}

