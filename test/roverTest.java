import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class roverTest {

    @Test
    public void shouldReturnZeroZeroWhenStartingPositionIsZeroZero(){
        Rover rover = new Rover(0,0,"N");
        assertThat(rover.getCurrentPosition(), is ("0,0"));
    }

    @Test
    public void shouldReturnFiveFiveWhenStartingPositionIsFiveFive(){
        Rover rover = new Rover(5,5,"N");
        assertThat(rover.getCurrentPosition(), is ("5,5"));
    }

    @Test
    public void shouldReturnNorthWhenOrientationIsNorth(){
        Rover rover = new Rover(2,2,"N");
        assertThat(rover.getOrientation(), is ("N"));
    }

    @Test
    public void shouldReturnSouthWhenOrientationIsSouth(){
        Rover rover = new Rover(3,3,"S");
        assertThat(rover.getOrientation(), is ("S"));
    }

    @Test
    public void shouldTurnLeft(){
        Rover rover = new Rover(0,0, "N");
        rover.turnLeft();
        assertThat(rover.getOrientation(), is ("W"));
    }

    @Test
    public void shouldTurnLeftAgain(){
        Rover rover = new Rover(0,0,"W");
        rover.turnLeft();
        assertThat(rover.getOrientation(), is ("S"));
    }

    @Test
    public void shouldTurnRight(){
        Rover rover = new Rover(0,0,"N");
        rover.turnRight();
        assertThat(rover.getOrientation(), is ("E"));
    }

    @Test
    public void shouldTurnRightAgain(){
        Rover rover = new Rover(0,0,"E");
        rover.turnRight();
        assertThat(rover.getOrientation(), is ("S"));
    }

    @Test
    public void shouldMoveNorth(){
        Rover rover = new Rover(0,0,"N");
        rover.move();
        assertThat(rover.getCurrentPosition(), is ("0,1"));
    }

    @Test
    public void shouldMoveEast(){
        Rover rover = new Rover(0,0,"E");
        rover.move();
        assertThat(rover.getCurrentPosition(), is("1,0"));
    }
}