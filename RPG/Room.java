
/**
 * A class to allow for the creation of Rooms for Generic Dungeon Crawler
 * 
 * @author jcboysha and e-waste
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
    //Constructors
    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        //Generates the map!
        this.genRoom();
    }
    //Operations
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
     * Performs all the necessary functions for when a room is entered. 
     * Changes variable isOccupied to true. 
     * Generates room contents. 
     * 
     */
    public void enterRoom()
    {
        this.isOccupied=true;
        contents = rand.nextInt(1000);
        if (contents == 999){
            this.isExit = true;
        }
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
     * Sets up the room to be printed. Makes all of the symbols put in the right place. Basically it makes everything look all pretty like. 
     */
    public void setupRoom()
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
        if (this.isOccupied){ //Player
            this.room[2][1] = '@';
        }
        else{ // No Player
            this.room[2][1] = ' ';
        }
        if (this.contents<700){//Monster
            this.room[2][3] = '!';
        }
        else if (this.contents>700 && this.contents<=975){//Nothing
            this.room[2][3] = 'N';
        }
        else if (this.contents == 1000){ //Empty - This will never be randomly selected. Variable is manually set to this value on room exit. 
            this.room[2][3] = ' ';
        }
        else{
            this.room[2][3] = '^'; //Item
        }
        if (this.isExit == true){
            this.room[1][3] = 'E'; //Exit door. 
        }
    }
    /**
     * Prints the room on the screen - For debugging. 
     * 
     */
    public void printRoom()
    {
        this.setupRoom();
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                System.out.print(this.room[i][j]);
                System.out.print(' ');
            }
            System.out.println("");
        }
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
    //Setters
    /**
     * Sets the variable isExit to parameter exit
     * 
     * @param exit boolean variable to set isExit to. 
     */
    public void setExit(boolean exit)
    {
        this.isExit = exit;
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
    //Getters
       /**
     * Gets the variable north
     */
    public boolean getNorth()
    {
        return this.north;
    }
    /**
     * Gets the variable south
     */
    public boolean getSouth()
    {
        return this.south;
    }
    /**
     * Gets the variable east
     */
    public boolean getEast()
    {
        return this.east;
    }
    /**
     * Gets the variable west
     */
    public boolean getWest()
    {
        return this.west;
    }
    /**
     * Returns the integer for the contents of the room
     * 
     */
    public int getContents()
    {
        return this.contents;
    }
}
