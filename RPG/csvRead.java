
/**
 * A class to facilitate the reading of CSV files
 * 
 * @author JC Boysha
 * @version 2014-04-25
 */
import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
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
     * @param id The integer for the id of the item in question.
     */
    public String[] readItem(int id)
    {
        String[] thing = new String[5];
        BufferedReader br = null;
        try{
            String fileName = ITEMS;
            br = new BufferedReader(new FileReader(fileName));
            String line=br.readLine();
            line=br.readLine();
            while(line != null){
                thing = line.split(",");
                if(Integer.parseInt(thing[0]) == id){
                    break;
                }
                line=br.readLine();
            }
            /*for(int i = 0; i < 6; i++){
                System.out.println(thing[i]);
            }*/
            return thing;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            return thing;
        }
        catch(IOException e){
            e.printStackTrace();
            return thing;
        }
        finally{
            if (br != null){
                try{
                    br.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
