package com.example.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by kowloon on 2016/5/18.
 */
public class OvalButton extends Button{
    private Paint paint = new Paint();

    public OvalButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array =  context.obtainStyledAttributes(attrs,null);
        //获得边框颜色属性的值
        int color = array.getInt(R.styleable.OvalButton_borderColor, Color.BLACK);
        //获得边框粗细属性的值
        int size = array.getInt(R.styleable.OvalButton_borderSize,0);
        //回收数组
        array.recycle();

        //设置画笔的粗细
        paint.setStrokeWidth(size);
        //设置画笔的颜色
        paint.setColor(color);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制按钮的边框
        canvas.drawRect(0,0,this.getWidth(),this.getHeight(),paint);

    }
}
