
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
     * Determines and sets the max characteristics of character
     * 
     * @param level The level of the player. Should always be a positive integer. 
     * @param xp The total experience points of the player. Should always be a positive integer.
     * 
     */
    public void maxCharacteristics(int level, int xp)
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
}
