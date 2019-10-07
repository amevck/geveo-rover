package com.geveo.rover.converter;

import com.geveo.rover.Rover;
import com.geveo.rover.commands.*;

import java.util.*;

public class CommandConverter {

    private static Map<String, ICommand> commandMap = new HashMap<String, ICommand>() {{
        put("L", new LeftCommand());
        put("R", new RightCommand());
        put("M", new MoveCommand());
    }};

    private String commandString;
    private ICommand doNothingCommand = new DoNothingCommand();
    public CommandConverter(final String commandString) {
        this.commandString = commandString;
    }


    public List<ICommand> getCommandsList(final String commandString) {
        List<ICommand> commands = new ArrayList<ICommand>();

        for (char ch: commandString.toCharArray()) {
            commands.add(getCommandFromMap(commandMap,String.valueOf(ch)));
        }

        return commands;
    }

    private ICommand getCommandFromMap(Map<String,ICommand> map,String key ){
        if(map.containsKey(key)){
            return map.get(key);
        }
        return doNothingCommand;
    }

    private void ExecuteAllCommands(List<ICommand> commandList, Rover rover){
        commandList.forEach(command -> command.execute(rover));
    }


}
