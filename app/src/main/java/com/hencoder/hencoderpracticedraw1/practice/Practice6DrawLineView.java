package com.hencoder.hencoderpracticedraw1.practice;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class Practice6DrawLineView extends View {

    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStrokeWidth(10.0f);
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        Log.d("onDraw", "displayMetrics.widthPixels is"+displayMetrics.widthPixels);
        canvas.drawLine(displayMetrics.widthPixels/2,20,
                displayMetrics.widthPixels/2+100,
                120,paint);
    }
}
