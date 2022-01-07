package org.thoughtcrime.securesms.components;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageButton;

import org.thoughtcrime.securesms.util.ViewUtil;

public class BenchmarkButton extends AppCompatImageButton
{

    @SuppressWarnings("unused")
    public BenchmarkButton(Context context) {
        super(context);
        ViewUtil.mirrorIfRtl(this, getContext());
    }

    @SuppressWarnings("unused")
    public BenchmarkButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        ViewUtil.mirrorIfRtl(this, getContext());
    }

    @SuppressWarnings("unused")
    public BenchmarkButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        ViewUtil.mirrorIfRtl(this, getContext());
    }

}
