
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
       //player.debugPlayer();
       
       player.inventory.addItem(2,0);
       player.inventory.addItem(11,1);
       player.inventory.addItem(11,2);
       player.inventory.addItem(11,3);
       player.inventory.addItem(11,4);
       player.inventory.printInventory();
       System.out.println(player.setCharacteristic('H', -5));
       System.out.println(player.setCharacteristic('M',-3));
       player.useItem(0);
       player.useItem(1);
       player.useItem(2);
       player.useItem(3);
       player.useItem(4);
       player.inventory.printInventory();
       System.out.println(player.setCharacteristic('H', 0));
       System.out.println(player.setCharacteristic('M',0));
   }
}
