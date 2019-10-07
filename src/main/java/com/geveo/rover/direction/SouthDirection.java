package com.geveo.rover.direction;

import com.geveo.rover.minefield.Grid;

public class SouthDirection extends Direction{
    public SouthDirection(DirectionSymbol symbol, Direction leftDirection, Direction rightDirection) {
        super(symbol, leftDirection, rightDirection);
    }

    @Override
    public void setNewCoordinates(Grid grid) {
        if(!grid.isOutOfBound(grid.getCurrentPosition().getX() ,grid.getCurrentPosition().getY() -1)){
            grid.getCurrentPosition().setY(grid.getCurrentPosition().getY() -1);
        }
    }

    public SouthDirection(DirectionSymbol symbol) {
        super(symbol);
    }
}
