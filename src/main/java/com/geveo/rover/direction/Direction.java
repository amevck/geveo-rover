package com.geveo.rover.direction;

import com.geveo.rover.minefield.Grid;

public abstract class Direction {
    private DirectionSymbol symbol;
    private Direction leftDirection;
    private Direction rightDirection;

    public Direction(DirectionSymbol symbol, Direction leftDirection, Direction rightDirection) {
        this.symbol = symbol;
        this.leftDirection = leftDirection;
        this.rightDirection = rightDirection;
    }

    public abstract void setNewCoordinates(Grid grid);

    public Direction(DirectionSymbol symbol) {
        this.symbol = symbol;
    }

    public DirectionSymbol getSymbol() {
        return symbol;
    }

    public Direction getLeftDirection() {
        return leftDirection;
    }

    public Direction getRightDirection() {
        return rightDirection;
    }

    public void setDirections(Direction leftDirection,Direction rightDirection){
        this.leftDirection = leftDirection;
        this.rightDirection  = rightDirection;
    }
}
