package com.jiu.androidheroes.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by jiu on 15/10/22.
 */
public class BlinkTextView extends TextView {
    private Paint mPaint;
    private LinearGradient mLinearGradient;
    private Matrix mGradientMaxtrix;
    private int mTranslate = 0;

    private int mViewWidth;

    public BlinkTextView(Context context) {
        super(context);
    }

    public BlinkTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BlinkTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        if (mViewWidth == 0) {
            mViewWidth = getMeasuredWidth();
            if (mViewWidth > 0) {
                mPaint = getPaint();
                mLinearGradient = new LinearGradient(0, 0, mViewWidth, 0,
                        new int[]{Color.BLUE, 0xffffffff, Color.BLUE}, null, Shader.TileMode.CLAMP);
                mPaint.setShader(mLinearGradient);
                mGradientMaxtrix = new Matrix();
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mGradientMaxtrix != null) {
            mTranslate += mViewWidth / 5;
            if (mTranslate > 2 * mViewWidth) {
                mTranslate = -mViewWidth;
            }
            mGradientMaxtrix.setTranslate(mTranslate, 0);
            mLinearGradient.setLocalMatrix(mGradientMaxtrix);
            postInvalidateDelayed(100);
        }
    }
}
