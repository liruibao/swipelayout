package com.honor.fighting.supereasyrefreshlayout.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;

/**
 * Created by liruibao on 2019-09-27.
 * email:silentlrb@gmail.com
 */
public abstract class FooterView extends FrameLayout implements RefreshListener{
    public int footerViewHeight;
    public static final int BASE_FOOTER_HEIGHT = 40;
    public FooterView(@NonNull Context context) {
        this(context,null);
    }

    public FooterView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        final DisplayMetrics metrics = getResources().getDisplayMetrics();
        footerViewHeight = (int) (BASE_FOOTER_HEIGHT * metrics.density);//注意高度的设置。
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec,MeasureSpec.makeMeasureSpec(footerViewHeight, MeasureSpec.EXACTLY));
    }

    public void setBaseViewHeight(int height) {
        final DisplayMetrics metrics = getResources().getDisplayMetrics();
        footerViewHeight = (int) (height * metrics.density);//注意高度的设置。
    }
}
