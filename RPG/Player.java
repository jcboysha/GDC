
/**
 * A class to build the player for each game. 
 * 
 * @author JCBoysha & e-waste
 * @version 0.0.1a
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int power, health, mana, armor, level, experience, toHitMod, maxHealth, maxPower,
                maxToHitMod, maxMana;
    private final int MAX_LEVEL = 10;
    private String name;
    public Inventory inventory = new Inventory();
    public SpellBook spellbook = new SpellBook();
    

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
        this.name = "player";
    }
    //Operations
     /**
     * Determines and sets the max characteristics of character
     * 
     * @param level The level of the player. Should always be a positive integer. 
     * @param xp The total experience points of the player. Should always be a positive integer.
     * 
     */
    public void maxChar(int level, int xp)
    {
        if(xp > 1000)
        {
            this.maxHealth = (10*level)+(1*(xp-1000));
            this.maxPower = (5*level)+(1*(xp-1000));
            this.maxMana = (5*level)+(1*(xp-1000));
        }
        else
        {
            this.maxHealth = 10*level;
            this.maxPower = 5*level;
            this.maxMana = 5*level;
        }
        this.maxToHitMod = 3*level;
        this.updateStats();
    }
    /**
     * Updates the statistics of the player with the non-disposable items in the inventory. 
     */
    public void updateStats()
    {
        for (int i = 0; i<inventory.inventory.length; i++){
            if(inventory.inventory[i]>0 && inventory.inventory[i]>20)
            {
                String[] stats = new String[6];
                stats = inventory.readItem(i);
                this.maxHealth += Integer.parseInt(stats[2]);
                this.power += Integer.parseInt(stats[3]);
                this.armor += Integer.parseInt(stats[4]);
                this.maxMana += Integer.parseInt(stats[5]);
            }
        }
    }
    /**
     * Uses the disposable item in the inventory. 
     * @param ref The reference point in the inventory to use the item.
     */
    public void useItem(int ref)
    {
        if (inventory.inventory[ref] > 0 && inventory.inventory[ref] < 21){
            String[] usedItem = new String[6];
            usedItem = inventory.readItem(ref);
            this.setCharacteristic('H',Integer.parseInt(usedItem[2]));
            this.setCharacteristic('P',Integer.parseInt(usedItem[3]));
            this.setCharacteristic('A',Integer.parseInt(usedItem[4]));
            this.setCharacteristic('M',Integer.parseInt(usedItem[5]));
            inventory.remItem(ref);
        }
    }
    /**
     * Drops the item in the inventory.
     * @param ref The reference point in the inventory to drop the item. 
     */
    public void dropItem(int ref)
    {
        inventory.remItem(ref);
    }
    /**
     * Calculates the level of the user and sets the variable accordingly. 
     * 
     * @param xp The total experience points of the player. Should always be a positive integer.
     */
    public void calcLevel(int xp)
    {
        if(xp>100)
        {
            this.level = xp/100;
        }
        else
        {
            this.level = 1;
        }
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
    }
    //Getters
    /**
     * Gets the power variable
     */
    public int getPower()
    {
        return this.power;
    }
    /**
     * Gets the health variable 
     */
    public int getHealth()
    {
        return this.health;
    }
    /**
     * Gets the mana variable
     */
    public int getMana()
    {
        return this.mana;
    }
    /**
     * Gets the armor variable
     */
    public int getArmor()
    {
        return this.armor;
    }
    /**
     * Gets the level variable
     */
    public int getLevel()
    {
        return this.level;
    }
    /**
     * Gets the experience variable
     */
    public int getExperience()
    {
        return this.experience;
    }
    /**
     * Gets the toHitMod variable
     */
    public int getToHitMod()
    {
        return this.toHitMod;
    }
    //Setters
    /**
     * Changes characteristic chosen by value of mod. 
     * 
     * @param Characteristic Char value for the characteristic that needs to be changed
     * @param mod Integert value of the modifier by which the chosen characteristic needs to be changed
     */
    public String setCharacteristic(char Characteristic, int mod)
    {
        String returnValue = "";
        switch (Character.toLowerCase(Characteristic)){
            case 'h': //Health
                if ((this.health+mod)<=this.maxHealth){
                    this.health += mod;
                    returnValue = "Health is now " + this.health + ".";
                    break;
                }
                else{
                    this.health = this.maxHealth;
                    returnValue = "Health is at max!";
                    break;
                }
            
            case 'p': //Power
                if ((this.power+mod)<=this.maxPower){
                    this.power += mod;
                    returnValue = "Power is now " + this.power + ".";
                    break;
                }
                else{
                    this.power = this.maxPower;
                    returnValue = "Power is at max!";
                    break;
                }
                
            case 'm': //Mana
                if ((this.mana+mod) <= this.maxMana){
                    this.mana += mod;
                    returnValue = "Mana is now " + this.mana + ".";
                    break;
                }
                else{
                    this.mana = this.maxMana;
                    returnValue = "Mana is at max!";
                    break;
                }
            
            case 'a': //Armor
                this.armor += mod;
                returnValue = "Armor is now " + this.armor + ".";
                break;

            case 'l': //Level
                if ((this.level+mod) <= this.MAX_LEVEL){
                    this.level += mod;
                    returnValue = "Level is now " + this.level + ".";
                    break;
                    }
                else{
                    this.level = this.MAX_LEVEL;
                    returnValue = "Level is at max!";
                    break;
                }
                
            case 'e': //Experience
                this.experience += mod;
                returnValue = "Experience is now " + this.experience + ".";
                break;
            
            case 't': //toHitMod
                if ((this.toHitMod+mod) <= this.maxToHitMod){
                    this.toHitMod += mod;
                    returnValue = "To Hit is now " + this.level + ".";
                    break;
                }
                else{
                    this.toHitMod = this.maxToHitMod;
                    returnValue = "Hit Mod is at max!";
                    break;
                }
        }
        return returnValue;
    }
    /**
     * Sets the name of the player to string Nom
     * 
     * @param nom String value to change player name to. 
     * 
     */
    public void setName(String nom)
    {
        this.name = nom;
    }
}
