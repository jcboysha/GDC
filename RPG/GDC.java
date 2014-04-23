
/**
 * Write a description of class GDC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GDC
{
   public static void main(String args[])
   {
       System.out.println("Room Debug");
       Room room = new Room();
       room.openNorth();
       room.enterRoom();
       room.debugRoom();
       
       System.out.println("\nRoom Change");
       room.leaveRoom();
       room.openSouth();
       room.debugRoom();
       
       System.out.println("\nPlayer Debug");
       Player player = new Player();
       player.setName("Daelphinux");
       player.debugPlayer();
       System.out.println("\nPlayer Change");
       player.setHealth(-3);
       player.setPower(1);
       player.debugPlayer();
   }
}
