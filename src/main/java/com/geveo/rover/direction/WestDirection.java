package com.geveo.rover.direction;

import com.geveo.rover.minefield.Grid;

public class WestDirection extends Direction{
    public WestDirection(DirectionSymbol symbol, Direction leftDirection, Direction rightDirection) {
        super(symbol, leftDirection, rightDirection);
    }

    @Override
    public void setNewCoordinates(Grid grid) {
        if(!grid.isOutOfBound(grid.getCurrentPosition().getX() - 1,grid.getCurrentPosition().getY())){
            grid.getCurrentPosition().setX(grid.getCurrentPosition().getX() - 1);
        }
    }

    public WestDirection(DirectionSymbol symbol) {
        super(symbol);
    }
}
