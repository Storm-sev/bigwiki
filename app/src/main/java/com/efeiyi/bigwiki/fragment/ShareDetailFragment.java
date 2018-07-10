package com.efeiyi.bigwiki.fragment;

import com.efeiyi.bigwiki.R;

import storm_lib.base.BaseCordovaFragment.BaseCordovaFragment;

public class ShareDetailFragment extends BaseCordovaFragment {



    @Override
    protected String loadWebViewUrl() {
        return "file:///android_asset/www/pages/news/details.html?id=1471";
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_share_open;
    }

    @Override
    protected void initData() {

    }
}
