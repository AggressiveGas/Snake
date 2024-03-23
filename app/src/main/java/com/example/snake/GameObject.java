package com.example.snake;

import android.graphics.Point;

public class GameObject {
    private Point location;

    public GameObject(int x, int y) {
        this.location = new Point(x, y);
    }

    public Point getLocation() {
        return location;
    }
}
