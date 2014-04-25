
/**
 * A class to facilitate the reading of CSV files
 * 
 * @author JC Boysha
 * @version 2014-04-25
 */
public class csvRead
{
    private final String ITEMS = "items.csv", SPELLS = "spells.csv", MONSTERS = "monsters.csv";
    
    /**
     * Constructor for objects of class csvRead
     */
    public csvRead()
    {
        //constructor does nothing. 
    }
    /**
     * A method to return an array of the values from the line of the CSV that is needed. 
     * 
     * @param category The string for the category of the thing, should always be Monsters, Spells, or Items. 
     * @param id The integer for the id of the item in question.
     */
    public String[] readThing(String category, int id)
    {
        return new String[5];
    }

}
