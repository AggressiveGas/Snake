package com.example.snake;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public abstract class GameObject {
    private Point location;

    public GameObject(int x, int y) {
        this.location = new Point(x, y);
    }

    public abstract void draw(Canvas canvas, Paint paint);

    public Point getLocation() {
        return location;
    }
}
