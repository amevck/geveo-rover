package com.geveo.rover;

import com.geveo.rover.direction.Directions;
import com.geveo.rover.minefield.Coordinates;
import com.geveo.rover.minefield.Grid;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoverApplicationTests {

	@Test
	public void contextLoads() {
		Rover rover = new Rover(new Grid(new Coordinates(3,3),new Coordinates(5,5)), Directions.EAST);
		rover.run("MMRMMRffMRRM");
		assert (rover.getDirection().equals(Directions.EAST));
		assert (rover.getGrid().getCurrentPosition().getX() == 5 &&  rover.getGrid().getCurrentPosition().getY() == 1 );

		rover = new Rover(new Grid(new Coordinates(1,2),new Coordinates(5,5)), Directions.NORTH);
		rover.run("LMLMLMLMM");
		assert (rover.getDirection().equals(Directions.NORTH));
		assert (rover.getGrid().getCurrentPosition().getX() == 1 &&  rover.getGrid().getCurrentPosition().getY() == 3 );

		rover = new Rover(new Grid(new Coordinates(1,2),new Coordinates(5,5)), Directions.NORTH);
		rover.run("LMLMLMLMMtest123");
		assert (rover.getDirection().equals(Directions.NORTH));
		assert (rover.getGrid().getCurrentPosition().getX() == 1 &&  rover.getGrid().getCurrentPosition().getY() == 3 );
	}

}
