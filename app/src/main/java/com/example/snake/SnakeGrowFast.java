package com.example.snake;

import android.content.Context;
import android.graphics.Point;

public class SnakeGrowFast extends Snake {
    public SnakeGrowFast(Context context, Point mr, int ss) {
        super(context, mr, ss);

    }

    //The snake grows double the rate of a normal snake
    @Override
    public boolean checkDinner(int x, int y) {
        int count = 1;
        if (getSegmentLocations().get(0).x == x &&
                getSegmentLocations().get(0).y == y) {

            // Add a new Point to the list
            // located off-screen.
            // This is OK because on the next call to
            // move it will take the position of
            // the segment in front of it
            getSegmentLocations().add(new Point(-10, -10));
            getSegmentLocations().add(new Point(-10, -10));
            return true;
        }
        return false;
    }
}
