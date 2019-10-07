package com.geveo.rover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PrintService {

    public void initialPrint() {
        System.out.println();
        System.out.println("1. Enter maximum coordinates.");
        System.out.println("2. Enter rover starting point with direction (Capital letters N E S W)");
        System.out.println("3. Enter rover commands (Capital letters L R M)");
        System.out.println("Continue entering step 3 and 4 (number of rovers)");
        System.out.println("After entering a new line assumes rovers are end.and the results will be shown");
        System.out.println();
        System.out.println("Eg:-");
        System.out.println("");
        System.out.println("5 5");
        System.out.println("1 2 N");
        System.out.println("LMLMLMLMM");
        System.out.println("3 3 E");
        System.out.println("MMRMMRMRRM");
        System.out.println("");
        System.out.println("please enter your values:");

    }

    public void endPrinting() {
        System.out.println();
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println("please enter your values:");
    }

    public void beforePrintResults(){
        System.out.println();
        System.out.println("_______________________ Your rover positions _________________________");
        System.out.println();
    }

}
