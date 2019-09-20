
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.matchers.JUnitMatchers;

public class RoverTest {

    rover rover = new rover();
    
    @Before
    public void beforeTest() {
        rover = new rover();
    }
        
    @Test
    public void testCoordinate() {
        
        rover.setPosition(1, 2, N);
        rover.process("LMLMLMLMM");
        assertThat(containsString(rover.printPosition(), "1 3 N"));
        
        rover.setPosition(3, 3, E);
        rover.process("MMRMMRMRRM");
        assertThat(containsString(rover.printPosition(), "5 1 E"));
    }  
        
}
