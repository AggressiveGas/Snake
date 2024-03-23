package com.example.snake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;

public class Hud {
    private int mTextFormatting;
    private int mScreenHeight;
    private int mScreenWidth;
    private ArrayList<Rect> controls;
    static int PAUSE = 0;

    public Hud(Point size){
        mScreenHeight = size.y;
        mScreenWidth = size.x;
        mTextFormatting = size.x / 50;
        prepareControls();
    }

    private void prepareControls(){
        int buttonWidth = mScreenWidth / 14;
        int buttonHeight = mScreenHeight / 12;
        int buttonPadding = mScreenWidth / 90;

        Rect pause = new Rect(
                buttonPadding,
                buttonPadding*7,
                buttonPadding + buttonWidth,
                buttonPadding*7 + buttonHeight);

        controls = new ArrayList<>();
        controls.add(PAUSE, pause);
    }

    void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.argb(255, 255, 255, 255));
        for(Rect rect : controls) {
            canvas.drawRect(rect, paint);
        }
    }

    ArrayList<Rect> getControls() {
        return controls;
    }
}
