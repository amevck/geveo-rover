package com.geveo.rover.commands;

import com.geveo.rover.Rover;

public class RightCommand implements ICommand {

    @Override
    public void execute(final Rover rover) {
        rover.right();
    }

}
