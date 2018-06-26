package com.efeiyi.bigwiki.fragment;

import com.efeiyi.bigwiki.R;

import storm_lib.base.BaseCordovaFragment.BaseCordovaFragment;

public class CordovaFragment extends BaseCordovaFragment {



    @Override
    protected String loadWebViewUrl() {
        return launchUrl;
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_cordova;
    }
}
