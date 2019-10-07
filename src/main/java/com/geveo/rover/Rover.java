package com.geveo.rover;


import com.geveo.rover.commands.ICommand;
import com.geveo.rover.direction.Direction;
import com.geveo.rover.minefield.Grid;
import com.geveo.rover.converter.CommandConverter;


import java.util.List;

public class Rover {

    private Grid grid;
    private Direction direction ;

    public Rover(final Grid grid,final Direction direction) {
        this.grid = grid;
        this.direction = direction;
    }

    public void run(final String commandString) {
        List<ICommand> roverCommands = new CommandConverter(commandString).getCommandsList(commandString);
        for (ICommand command : roverCommands) {
            command.execute(this);
        }
    }

    public String getCurrentPosition(){
        return "" + getGrid().getCurrentPosition().getX() + " " + getGrid().getCurrentPosition().getY() + " " + getDirection().getSymbol().toString();
    }

    public Grid getGrid() {
        return grid;
    }

    public Direction getDirection() {
        return direction;
    }

    public void right() {
        this.direction = direction.getRightDirection();
    }

    public void left() {
        this.direction = direction.getLeftDirection();
    }

    public void move() {
       this.direction.setNewCoordinates(grid);
    }
}
