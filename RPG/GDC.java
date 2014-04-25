
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
      
       player.inventory.sampleMethod();
       System.out.println("\nRoom Content Test:");
       for(int i = 0; i <= 5; i++){
           room.enterRoom();
           int c1 = room.getContents();
           System.out.print(c1 + ": ");
           if (c1<700){
               System.out.println("A MONSTER!");
           }
           else if (c1>700 && c1<=850){
               System.out.println("NOTHING HAPPENS!");
           }
           else if(c1>850 && c1<=998){
               System.out.println("AN ITEM!");
           }
           else{
               System.out.println("AN EXIT!");
           }
       }
       room.enterRoom();
       room.printRoom();
       System.out.println("Room Changed");
       room.openSouth();
       room.leaveRoom();
       room.printRoom();
   }
}
