
/**
 * A series of methods to handle the storage of items in the inventory and manipulation of said items
 * 
 * @author jcboysha and e-waste 
 * @version 0.0.1a
 */
public class Inventory
{
    public int[] inventory = new int[5];
    private String[] item = new String[6];
    private csvRead csv = new csvRead();
    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        //initialize to a non-existent item
        for (int i = 0; i<inventory.length; i++){
            inventory[i] = 0;
        }
    }
    /**
     * Adds an item of parameter id to the inventory. 
     * 
     * @param  id  the id of the item to add. This can be found in items.csv to set manually. 
     * @param ref the point in the inventory to add the item.
     */
    public void addItem(int id, int ref)
    {
        inventory[ref] = id; 
    }
    /**
     * Removes an item from the inventory at ref point. 
     * @param ref the point in the inventory to remove the item. 
     */
    public void remItem(int ref)
    {
        inventory[ref] = 0;
    }
    /**
     * Read the itms in the array and return the variables therefrom. 
     * @param ref The placement of the item in the array. 
     */
    public String[] readItem(int ref)
    {
        item = csv.readItem(inventory[ref]);
        return item;
    }
    /**
     * Prints the inventory on the screen
     */
    public void printInventory()
    {
        for (int i = 0; i<inventory.length; i++){
            if (inventory[i] != 0){
                item = csv.readItem(inventory[i]);
                System.out.println("Name:\t\tHealth:\tPower:\tArmor:\tMana:");
                System.out.println(item[1]+"\t"+item[2]+"\t"+item[3]+"\t"+item[4]+"\t"+
                                   item[5]);
            }
        }
    }
  }
