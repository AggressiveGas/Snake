package com.example.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Background extends GameObject {
    private Bitmap mBitmapBackground;

    public Background(Context context, Point range) {
        super(range);

        // Load the image to the bitmap
        mBitmapBackground = BitmapFactory.decodeResource(context.getResources(), R.drawable.grass);

        // Resize the bitmap
        mBitmapBackground = Bitmap.createScaledBitmap(mBitmapBackground, getRangeX(), getRangeY(), false);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(mBitmapBackground,
                0, 0, paint);
    }
}
