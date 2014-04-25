
/**
 * The main class. Used to run GDC by calling EVERYTHING ELSE
 * 
 * @author jcboysha and e-waste
 * @version 0.0.1a
 */

public class GDC
{
    /**
     * Main - it does things!
     */
   public static void main(String args[])
   {
       csvRead csv = new csvRead();
       Room room = new Room();
       Player player = new Player();
       /*System.out.println("Room Debug");
       room.openNorth();
       room.enterRoom();
       room.debugRoom();
       
       System.out.println("\nRoom Change");
       room.leaveRoom();
       room.openSouth();
       room.debugRoom();
       */
       System.out.println("\nPlayer Debug");
       player.setName("Daelphinux");
       //player.debugPlayer();
       player.maxChar(player.getLevel(), player.getExperience());
       System.out.println("\nPlayer Change");
       System.out.println(player.setCharacteristic('H', 5));
       System.out.println(player.setCharacteristic('M', -2));
       //player.debugPlayer();
       
       player.inventory.addItem(2,0);
       player.inventory.addItem(1,1);
       player.inventory.addItem(3,2);
       player.inventory.printInventory();
   }
}
