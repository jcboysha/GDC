
/**
 * A class to build the player for each game. 
 * 
 * @author J.C. Boysha
 * @version 4/23/2014
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setPower(int pow)
    {
        this.power += pow;
    }
    public void setHealth(int mod)
    {
        this.health += mod;
    }
    public void setMana(int mod)
    {
        this.mana += mod;
    }
    public void setArmor(int mod)
    {
        this.armor += mod;
    }
    public void setName(String nom)
    {
        this.name = nom;
    }
    public void setExperience(int mod)
    {
        this.experience += mod;
    }
    public void setToHitMod(int mod)
    {
        this.toHitMod += mod;
    }
    public void addToInventory(int id, int reference)
    {
        inventory[reference] = id;
    }
    public void addToSpellbook(int id, int reference)
    {
        spellBook[reference] = id;
    }
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
