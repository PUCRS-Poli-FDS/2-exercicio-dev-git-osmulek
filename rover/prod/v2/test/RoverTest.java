import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class RoverTest {

    private Rover rover;
    private Coordinates roverCoordinates;
    private final Direction direction = Direction.NORTH;
    private Point x;
    private Point y;

    @Before
    public void beforeRoverTest() {
        
        x = new Point(1, 9);
        y = new Point(2, 9);
        x.setLocation(0);
        y.setLocation(0);
        roverCoordinates = new Coordinates(x, y, direction);
        rover = new Rover(roverCoordinates);
    }
    
    @Test(expected = Exception.class)
    public void commandUnknown55() throws Exception {
        rover.receiveCommands('5 5');
    }
    
    @Test(expected = Exception.class)
    public void commandUnknown12N() throws Exception {
        rover.receiveCommands('1 2 N');
    }
    
    @Test(expected = Exception.class)
    public void commandUnknown33E() throws Exception {
        rover.receiveCommands('3 3 E');
    }

    @Test
    public void commandLMLMLMLMM() throws Exception {
        rover.receiveCommands('LMLMLMLMM');
        assertThat(rover.getPosition().contains("1 3 N"));
    }
    
    @Test
    public void commandMMRMMRMRRM() throws Exception {
        rover.receiveCommands('MMRMMRMRRM');
        assertThat(rover.getPosition().contains("5 1 E"));
    }

}