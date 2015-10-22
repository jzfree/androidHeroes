package com.jiu.androidheroes.views;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class RectTextView extends TextView {
    private Paint mPaint1;
    private Paint mPaint2;

    public RectTextView(Context context) {
        super(context);
    }

    public RectTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RectTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mPaint1 = new Paint();
        mPaint1.setColor(getResources().getColor(android.R.color.holo_blue_light));
    }


}
