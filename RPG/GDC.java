
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
       
       System.out.println("\nPlayer Debug");
       player.setName("Daelphinux");
       player.debugPlayer();
       System.out.println("\nPlayer Change");
       player.setHealth(-3);
       player.setPower(1);
       player.debugPlayer();
       */
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
   }
}
