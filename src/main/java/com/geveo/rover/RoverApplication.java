package com.geveo.rover;

import com.geveo.rover.commandLine.CommandLineApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoverApplication implements CommandLineRunner {
	@Autowired
    CommandLineApplication commandLineApplication;

	public static void main(String[] args) {
		SpringApplication.run(RoverApplication.class, args);
	}

	@Override
	public void run(String[] args) {
		commandLineApplication.run();
	}
}

