package com.honor.fighting.supereasyrefreshlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;

/**
 * Created by liruibao on 2019-09-27.
 * email:silentlrb@gmail.com
 */
public abstract class HeaderView extends FrameLayout implements RefreshListener {
    public int headViewHeight;
    public static final int BASE_HEADER_HEIGHT = 40;
    public HeaderView(Context context) {
        this(context,null);
    }

    public HeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        final DisplayMetrics metrics = getResources().getDisplayMetrics();
        headViewHeight = (int) (BASE_HEADER_HEIGHT * metrics.density);//注意高度的设置。
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec,MeasureSpec.makeMeasureSpec(headViewHeight, MeasureSpec.EXACTLY));
    }

    public void setBaseViewHeight(int height) {
        final DisplayMetrics metrics = getResources().getDisplayMetrics();
        headViewHeight = (int) (height * metrics.density);//注意高度的设置。
    }
}
