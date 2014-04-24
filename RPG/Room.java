
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
    private char[][] room = new char[5][5];
    private Random rand = new Random();
    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        //Generates the map!
        this.genRoom();
    }
    /**
     * Generates the map of the room to be outputted. By default it's a closed 5x5 Square with an asterix border. 
     */
    public void genRoom()
    {
        for (int i = 0; i<5; i++){
            this.room[i][0] = '*';
            this.room[0][i] = '*';
            this.room[i][4] = '*';
            this.room[4][i] = '*';
        }
        for (int i = 1; i<4; i++){
            for (int j=1; j<4; j++){
                this.room[i][j] = ' ';
            }
        }
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
        contents = 1000;
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
        if (this.north == true){
            this.room[0][2] = ' ';
        }
        if (this.south == true){
            this.room[4][2] = ' ';
        }
        if (this.east == true){
            this.room[2][0] = ' ';
        }
        if (this.west == true){
            this.room[2][4] = ' ';
        }
        if (this.isOccupied){
            this.room[2][1] = '@';
        }
        else{
            this.room[2][1] = ' ';
        }
        if (this.contents<700){
            this.room[2][3] = '!';
        }
        else if (this.contents>700 && this.contents<=975){
            this.room[2][3] = 'N';
        }
        else if (this.contents == 1000){
            this.room[2][3] = ' ';
        }
        else{
            this.room[2][3] = '^';
        }
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                System.out.print(this.room[i][j]);
                System.out.print(' ');
            }
            System.out.println("");
        }
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
