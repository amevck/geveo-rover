package com.geveo.rover.commandLine;

import com.geveo.rover.Rover;
import com.geveo.rover.direction.Direction;
import com.geveo.rover.minefield.Coordinates;
import com.geveo.rover.minefield.Grid;

public class RoverExecution {
    private String commands;
    private Direction direction;
    private Coordinates startingPoint;
    private Coordinates maxCoordinates;

    public RoverExecution(Direction direction, String commands, Coordinates startingPoint, Coordinates maxCoordinates) {
        this.commands = commands;
        this.startingPoint = startingPoint;
        this.maxCoordinates = maxCoordinates;
        this.direction = direction;
    }

    public RoverExecution(Direction direction, Coordinates startingPoint, Coordinates maxCoordinates) {
        this.startingPoint = startingPoint;
        this.maxCoordinates = maxCoordinates;
        this.direction = direction;
    }

    public Rover getRover() {
        return new Rover(new Grid(getStartingPoint(), getMaxCoordinates()), getDirection());
    }

    public Direction getDirection() {
        return direction;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Coordinates getStartingPoint() {
        return startingPoint;
    }

    public Coordinates getMaxCoordinates() {
        return maxCoordinates;
    }
}
