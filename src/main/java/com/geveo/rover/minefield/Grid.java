package com.geveo.rover.minefield;

public class Grid {
    private Coordinates currentPosition;
    private final Coordinates maxCordinates;

    public Grid(Coordinates currentCordinates, Coordinates maxCoordinates) {
        this.currentPosition = currentCordinates;
        this.maxCordinates = maxCoordinates;
    }

    public boolean isOutOfBound(final int x, final int y){
        return maxCordinates.getX() < x|| maxCordinates.getX() < y ||
                y < 0 || x < 0;
    }

    public Coordinates getCurrentPosition() {
        return currentPosition;
    }

    public Coordinates getMaxCordinates() {
        return maxCordinates;
    }

    public void setCurrentPosition(Coordinates currentPosition) {
        this.currentPosition = currentPosition;
    }
}
