package com.geveo.rover.commandLine;

import com.geveo.rover.Rover;
import com.geveo.rover.direction.Directions;
import com.geveo.rover.minefield.Coordinates;
import com.geveo.rover.minefield.Grid;
import com.geveo.rover.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import static java.lang.System.exit;

@Component
public class CommandLineApplication {
    @Autowired
    PrintService printService;

    public void run() {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        printService.initialPrint();
        while(true) {
            List<RoverExecution> roverExecutions = new ArrayList<>();
            try {
                String commandLineString = reader.readLine();
                Coordinates maxCoordinates = praseMaxCoordinates(commandLineString);
                while (!"".equals(commandLineString.trim())) {
                    commandLineString = reader.readLine();
                    if("".equals(commandLineString.trim())){
                        break;
                    }
                    RoverExecution roverExecution = praseStartingPoint(commandLineString, maxCoordinates);
                    commandLineString = reader.readLine();
                    if("".equals(commandLineString.trim())){
                        break;
                    }
                    roverExecution.setCommands(commandLineString);
                    roverExecutions.add(roverExecution);
                }

            } catch (Exception e) {
//                e.printStackTrace();
                System.out.println("Rovers with invalid data automatically removed");
                System.out.println();
            }
            printService.beforePrintResults();
            executeRoverList(roverExecutions);
            printService.endPrinting();
        }
        }


 private Coordinates praseMaxCoordinates(String intArrAsStr){
     StringTokenizer tk = new StringTokenizer(intArrAsStr);
     int maxX = Integer.parseInt(tk.nextToken());
     int maxY = Integer.parseInt(tk.nextToken());
     return new Coordinates(maxX,maxY);
 }

    private RoverExecution praseStartingPoint(String StartingPointArrAsStr,Coordinates maxCoordinates) throws Exception {
        StringTokenizer tk = new StringTokenizer(StartingPointArrAsStr);
        int x = Integer.parseInt(tk.nextToken());
        int y = Integer.parseInt(tk.nextToken());
        String direction = tk.nextToken();
        return new RoverExecution(Directions.getDirectionFromString(direction),new Coordinates(x,y),maxCoordinates);
    }

    private void executeRoverList(List<RoverExecution> executionList){
        executionList.forEach(
                roverExecution -> {
                    Rover rover = roverExecution.getRover();
                    rover.run(roverExecution.getCommands());
                    System.out.println(rover.getCurrentPosition());
                }
        );
    }

}
