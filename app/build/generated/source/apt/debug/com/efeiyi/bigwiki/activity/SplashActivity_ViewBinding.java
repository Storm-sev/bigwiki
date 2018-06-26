// Generated code from Butter Knife. Do not modify!
package com.efeiyi.bigwiki.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.efeiyi.bigwiki.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SplashActivity_ViewBinding implements Unbinder {
  private SplashActivity target;

  @UiThread
  public SplashActivity_ViewBinding(SplashActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SplashActivity_ViewBinding(SplashActivity target, View source) {
    this.target = target;

    target.ivSplash = Utils.findRequiredViewAsType(source, R.id.iv_splash, "field 'ivSplash'", ImageView.class);
    target.vpGuide = Utils.findRequiredViewAsType(source, R.id.vp_guide, "field 'vpGuide'", ViewPager.class);
    target.btnToMain = Utils.findRequiredViewAsType(source, R.id.btn_to_main, "field 'btnToMain'", ImageButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SplashActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivSplash = null;
    target.vpGuide = null;
    target.btnToMain = null;
  }
}
