
/**
 * A class to build the player for each game. 
 * 
 * @author JCBoysha & e-waste
 * @version 0.0.1a
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int power, health, mana, armor, level, experience, toHitMod;
    private int[] inventory = new int[5];
    private int[] spellBook = new int[5];
    private String name;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        this.power = 5;
        this.health = 10;
        this.mana = 5;
        this.armor = 0;
        this.level = 1;
        this.experience = 0;
        this.toHitMod = 0;
        for (int i = 0; i<inventory.length;i++){
            inventory[i] = 0;
        }
        this.name = "player";
    }
    /**
     * Modifies the power of the player by amount of variable mod. 
     * 
     * @param pow The modifying integer. Can be positive or negative
     * 
     */
    public void setPower(int pow)
    {
        this.power += pow;
    }
    /**
     * Modifies the health of the player by amount of variable mod. 
     * 
     * @param mod The modifying integer. Can be positive or negative
     * 
     */
    public void setHealth(int mod)
    {
        this.health += mod;
    }
    /**
     * Modifies the mana of the player by amount of variable mod. 
     * 
     * @param mod The modifying integer. Can be positive or negative
     * 
     */
    public void setMana(int mod)
    {
        this.mana += mod;
    }
    /**
     * Modifies the armor of the player by amount of variable mod. 
     * 
     * @param mod The modifying integer. Can be positive or negative
     * 
     */
    public void setArmor(int mod)
    {
        this.armor += mod;
    }
    /**
     * Sets the name of the player to string nom
      * 
     * @param nom Name of the player. String.
     * 
     */
    public void setName(String nom)
    {
        this.name = nom;
    }
     /**
     * Modifies the experience of the player by int mod. 
     * 
     * @param mod The modifying integer. Should, almost, always be positive
     * 
     */
    public void setExperience(int mod)
    {
        this.experience += mod;
    }
     /**
     * Modifies the toHitMod of the player by int mod. 
     * 
     * @param mod The modifying integer. Can be positive or negative.
     * 
     */
    public void setToHitMod(int mod)
    {
        this.toHitMod += mod;
    }
     /**
     * Adds an item to the inventory of id at position reference. 
     * 
     * @param id The ID int of the item in items.csv should always correspond to an item in the items.csv file
     * @param reference The point in the array where the item should be stored. Should always be between 0 and 4.
     * 
     */
    public void addToInventory(int id, int reference)
    {
        inventory[reference] = id;
    }
     /**
     * Adds an spell to the spellbook of id at position reference. 
     * 
     * @param id The ID int of the spell in spells.csv should always correspond to a spell in the spells.csv file
     * @param reference The point in the array where the item should be stored. Should always be between 0 and 4.
     * 
     */
    public void addToSpellbook(int id, int reference)
    {
        spellBook[reference] = id;
    }
     /**
     * Prints out all the variables and values of the instance of player. 
     * 
     * 
     */
    public void debugPlayer()
    {
        System.out.println("name: " + name);
        System.out.println("power: " + power);
        System.out.println("mana: " + mana);
        System.out.println("health: " + health);
        System.out.println("armor: " + armor);
        System.out.println("level: " + level);
        System.out.println("experience: " + experience);
        System.out.println("toHitMod: " + toHitMod);
        System.out.println("inventory: ");
        for (int i = 0; i < inventory.length; i++)
        {
            System.out.println("item " + i + ": " + inventory[i]);
        }
        System.out.println("spellBook: ");
         for (int i = 0; i < inventory.length; i++)
        {
            System.out.println("spell " + i + ": " + inventory[i]);
        }
    }
}
