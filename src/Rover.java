import java.util.ArrayList;

public class Rover {

    private int xCoordinate;
    private int yCoordinate;
    private String orientation;
    public String currentPosition;
    private ArrayList<String> directions = new ArrayList();
    {
        directions.add("N");
        directions.add("E");
        directions.add("S");
        directions.add("W");
    }


    public Rover(int xCoordinate, int yCoordinate, String orientation) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.orientation = orientation;
    }
    public String getCurrentPosition() {
        currentPosition = Integer.toString(xCoordinate) + "," + Integer.toString(yCoordinate);
        return currentPosition;
    }

    public String getOrientation() {
        return orientation;
    }

    public void turnLeft() {
       int indexOfCurrentPosition = directions.indexOf(orientation);
       if(indexOfCurrentPosition == 0){
           orientation = "W";
       }
       else {
           orientation = directions.get(indexOfCurrentPosition - 1);
       }
    }

    public void turnRight() {
        int indexOfCurrentPosition = directions.indexOf(orientation);
        if(indexOfCurrentPosition == 3){
            orientation = "N";
        }
        else {
            orientation = directions.get(indexOfCurrentPosition + 1);
        }
    }

    public void move() {
        if(orientation == "N"){
            yCoordinate++;
        }
        if(orientation == "E"){
            xCoordinate++;
        }
        if(orientation == "S"){
            yCoordinate--;
        }
        if(orientation == "W"){
            xCoordinate--;
        }
    }
}
