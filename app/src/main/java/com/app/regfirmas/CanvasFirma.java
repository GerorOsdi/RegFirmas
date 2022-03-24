package com.app.regfirmas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class CanvasFirma extends View {
    Paint pintura;
    Path path;

    public CanvasFirma(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        pintura = new Paint();
        path = new Path();

        pintura.setAntiAlias(true);
        pintura.setColor(Color.BLACK);
        pintura.setStrokeJoin(Paint.Join.ROUND);
        pintura.setStyle(Paint.Style.STROKE);
        pintura.setStrokeWidth(5f);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path,pintura);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float xpos = event.getX();
        float ypox = event.getY();

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                path.moveTo(xpos,ypox);
                return true;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(xpos,ypox);
                break;
            case MotionEvent.ACTION_UP:
                break;

            default:
                return false;
        }
        invalidate();
        return true;
    }
}
