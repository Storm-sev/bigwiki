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

public class GuideActivity_ViewBinding implements Unbinder {
  private GuideActivity target;

  @UiThread
  public GuideActivity_ViewBinding(GuideActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GuideActivity_ViewBinding(GuideActivity target, View source) {
    this.target = target;

    target.vpGuide = Utils.findRequiredViewAsType(source, R.id.vp_guide, "field 'vpGuide'", ViewPager.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageButton.class);
    target.ivDownloadGuide = Utils.findRequiredViewAsType(source, R.id.iv_download_guide, "field 'ivDownloadGuide'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GuideActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vpGuide = null;
    target.back = null;
    target.ivDownloadGuide = null;
  }
}
