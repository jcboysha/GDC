
/**
 * A class to allow for the creation of Rooms for Generic Dungeon Crawler
 * 
 * @author JC Boysha 
 * @version 4/22/2014
 */
import java.util.Random;
public class Room
{
    // instance variables
    private boolean isOccupied = false, north=false, south=false, east=false, west=false;
    private int contents; 
    private Random rand = new Random();
    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        contents = rand.nextInt(4);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void openNorth()
    {
        this.north=true;
    }
    public void openSouth()
    {
        this.south=true;
    }
    public void openEast()
    {
        this.east=true;
    }
    public void openWest()
    {
        this.west=true;
    }
    public void enterRoom()
    {
        this.isOccupied=true;
    }
    public void leaveRoom()
    {
        this.isOccupied=false;
    }
    public int getContents()
    {
        return this.contents;
    }
    
    public void debugRoom()
    {
        System.out.println("isOccupied: " + isOccupied);
        System.out.println("north: " + north);
        System.out.println("south: " + south);
        System.out.println("east: " + east);
        System.out.println("west: " + west);
        System.out.println("contents: " + contents);
    }
}
