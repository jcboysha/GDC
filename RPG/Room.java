
/**
 * A class to allow for the creation of Rooms for Generic Dungeon Crawler
 * 
 * @author JCBoysha and e-waste
 * @version 0.0.1a
 */
import java.util.Random;
public class Room
{
    // instance variables
    private boolean isOccupied = false, north=false, south=false, east=false, west=false, isExit=false;
    private int contents; 
    private Random rand = new Random();
    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        //DOES NOTHING!
        //INTENTIONALLY!
    }

    /**
     * Sets the variable that says the north door is open. 
     * 
     */
    public void openNorth()
    {
        this.north=true;
    }
    /**
     * Sets the variable that says the south door is open. 
     * 
     */
    public void openSouth()
    {
        this.south=true;
    }
    /**
     * Sets the variable that says the east door is open. 
     * 
     */
    public void openEast()
    {
        this.east=true;
    }
    /**
     * openWest - Sets the variable that says the west door is open. 
     * 
     */
    public void openWest()
    {
        this.west=true;
    }
    /**
     * Performs all the necessary functions for when a room is entered. 
     * Changes variable isOccupied to true. 
     * Generates room contents. 
     * 
     */
    public void enterRoom()
    {
        this.isOccupied=true;
        contents = rand.nextInt(1000);
    }
    /**
     * Performs all the necessary functions for when a room is left.
     * Changes isOccupied to false. 
     * 
     */
    public void leaveRoom()
    {
        this.isOccupied=false;
    }
    /**
     * getContents - returns the integer for the contents of the room
     * 0-700 for a monster
     * 700-850 for nothing
     * 850-998 for an item
     * 999 for an exit.
     * 
     */
    public int getContents()
    {
        return this.contents;
    }
    /**
     * Prints the room on the screen
     * 
     */
    public void printRoom()
    {
        //TODO - write code to print room on screen. 
    }
    /**
     * Sets the variable isExit to true
     * 
     */
    public void setExit()
    {
        this.isExit = true;
    }
    /**
     * Used for debugging. Outputs variables and values. 
     * 
     */
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
