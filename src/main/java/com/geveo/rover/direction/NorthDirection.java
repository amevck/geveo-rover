package com.geveo.rover.direction;

import com.geveo.rover.minefield.Grid;

public class NorthDirection extends Direction{
    public NorthDirection(DirectionSymbol symbol, Direction leftDirection, Direction rightDirection) {
        super(symbol, leftDirection, rightDirection);
    }

    @Override
    public void setNewCoordinates(Grid grid) {
        if(!grid.isOutOfBound(grid.getCurrentPosition().getX(),grid.getCurrentPosition().getY() +1)){
            grid.getCurrentPosition().setY(grid.getCurrentPosition().getY() + 1);
        }
    }

    public NorthDirection(DirectionSymbol symbol) {
        super(symbol);
    }
}
