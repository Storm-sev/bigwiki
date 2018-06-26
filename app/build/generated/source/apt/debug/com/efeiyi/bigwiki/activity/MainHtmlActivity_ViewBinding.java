// Generated code from Butter Knife. Do not modify!
package com.efeiyi.bigwiki.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.efeiyi.bigwiki.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainHtmlActivity_ViewBinding implements Unbinder {
  private MainHtmlActivity target;

  @UiThread
  public MainHtmlActivity_ViewBinding(MainHtmlActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainHtmlActivity_ViewBinding(MainHtmlActivity target, View source) {
    this.target = target;

    target.flMain = Utils.findRequiredViewAsType(source, R.id.fl_main, "field 'flMain'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainHtmlActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.flMain = null;
  }
}
