package com.example.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import java.util.Random;

public class Apple extends GameObject {

    // The location of the apple on the grid
    // Not in pixels
    //private Point location = new Point();

    // The range of values we can choose from
    // to spawn an apple
    //private Point mSpawnRange;
    private int mSize;

    // An image to represent the apple
    private Bitmap mBitmapApple;

    /// Set up the apple in the constructor
    public Apple(Context context, Point sr, Point loc, int s) {
        super(sr, loc);

        // Make a note of the passed in spawn range
        //mSpawnRange = sr;
        // Make a note of the size of an apple
        mSize = s;
        // Hide the apple off-screen until the game starts
        //location.x = -10;

        // Load the image to the bitmap
        mBitmapApple = BitmapFactory.decodeResource(context.getResources(), R.drawable.apple);

        // Resize the bitmap
        mBitmapApple = Bitmap.createScaledBitmap(mBitmapApple, s, s, false);
    }

    // This is called every time an apple is eaten
    public void spawn() {
        // Choose two random values and place the apple
        Random random = new Random();
        this.setLocationX(random.nextInt(this.getRangeX()) + 1);
        this.setLocationY(random.nextInt(this.getRangeY() - 1) + 1);
    }

    // Let SnakeGame know where the apple is
    // SnakeGame can share this with the snake
    /*public int getLocation() {
        return location;
    }*/

    // Draw the apple
    @Override
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(mBitmapApple,
                this.getLocationX() * mSize, this.getLocationY() * mSize, paint);

    }

}