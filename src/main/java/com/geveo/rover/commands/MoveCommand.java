package com.geveo.rover.commands;

import com.geveo.rover.Rover;

public class MoveCommand implements ICommand {

    @Override
    public void execute(final Rover rover) {
        rover.move();
    }

}
