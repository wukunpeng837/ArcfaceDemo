package com.arcsoft.arcfacedemo.widget;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;

public class CustomTextureView extends TextureView {
    private int radius = 0;
    public CustomTextureView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public void turnRound(){
        setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                Rect rect = new Rect(0,0, view.getMeasuredWidth() , view.getMeasuredHeight());
                outline.setRoundRect(rect, radius);
            }
        });
        setClipToOutline(true);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
