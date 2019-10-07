package com.geveo.rover.direction;


import java.util.HashMap;
import java.util.Map;

public class Directions {
    public static final Direction EAST = new EastDirection(DirectionSymbol.E);
    public static final Direction WEST = new WestDirection(DirectionSymbol.W);
    public static final Direction NORTH = new NorthDirection(DirectionSymbol.N);
    public static final Direction SOUTH = new SouthDirection(DirectionSymbol.S);
    private static Map<String, Direction> commandMap;

    static {
        EAST.setDirections(NORTH, SOUTH);
        WEST.setDirections(SOUTH, NORTH);
        NORTH.setDirections(WEST, EAST);
        SOUTH.setDirections(EAST, WEST);
        commandMap = new HashMap<String, Direction>() {{
            put("E", EAST);
            put("S", WEST);
            put("N", NORTH);
            put("W", SOUTH);
        }};
    }

    public static Direction getDirectionFromString(String directionStr) throws Exception {
        if(commandMap.containsKey(directionStr)){
            return commandMap.get(directionStr);
        }
        throw new Exception("Direction not found");
    }

}

