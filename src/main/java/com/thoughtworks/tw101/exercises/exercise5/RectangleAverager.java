package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private Rectangle[] rectangles;

    public float averageArea(Rectangle[] rectangles) {
        this.rectangles = rectangles;

        return ((float) sumArea())/rectangles.length;
    }

    private int sumArea() {
        int sumOfAreas = 0;

        for ( Rectangle rectangle : rectangles ) {
            sumOfAreas += rectangle.area();
        }

        return sumOfAreas;
    }
}
