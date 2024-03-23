package com.example.snake;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public abstract class GameObject {
    private Point location;
    private Point range;

    public GameObject(Point sr, Point loc) {
        this.location = new Point(loc);
        this.range = new Point(sr);
    }

    public GameObject(Point mr) {
        this.range = new Point(mr);
    }

    public abstract void draw(Canvas canvas, Paint paint);

    public int getLocationX() {
        return location.x;
    }

    public int getLocationY() {
        return location.y;
    }

    public void setLocationX(int locationX) {
        this.location.x = locationX;
    }

    public void setLocationY(int locationY) {
        this.location.y = locationY;
    }

    public int getRangeX() {
        return range.x;
    }

    public int getRangeY() {
        return range.y;
    }

    public void setRangeX(int rangeX) {
        this.range.x = rangeX;
    }

    public void setRangeY(int rangeY) {
        this.range.y = rangeY;
    }
}
